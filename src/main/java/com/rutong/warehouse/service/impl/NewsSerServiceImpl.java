package com.rutong.warehouse.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rutong.warehouse.domain.ApiPager;
import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.Meetingset;
import com.rutong.warehouse.domain.News;
import com.rutong.warehouse.domain.Newsmeetinglink;
import com.rutong.warehouse.persistence.INewsSetMapper;
import com.rutong.warehouse.service.INewsSetService;
import com.rutong.warehouse.utils.UUIDUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author 冯怿
 * @since 2019/6/15 22:55
 */
@Service
public class NewsSerServiceImpl implements INewsSetService {
    @Resource
    private INewsSetMapper newsSetMapper;

    private String bathPath = "/home/data";
    @Override
    public ApiResult searchNewsList(News news) {
        PageHelper.startPage(news.getPage(), news.getSize(), true);
        Page<News> page;
        if(news.isHaslink()){
            page =(Page<News>) newsSetMapper.searchNewsListLink(news);
        }else{
            page =(Page<News>) newsSetMapper.searchNewsList(news);
        }
        ApiPager<News> apiPage = new ApiPager<>(page.getPageSize(), page.getPageNum(), page.getTotal(), page.getResult());
        return new ApiResult<>().success(apiPage);
    }
    private void changeImage(News news){
        if(news.getIsimage()==1){
            newsSetMapper.setNewsNotImage();
        }
    }
    @Override
    public ApiResult searchNews(News news) {
        News news1 = newsSetMapper.searchNewsById(news);
        news1.setMeetingset(searchMeetingByNews(news));
        List<News> newsList = newsSetMapper.searchNewsListAll();
        for(int i=0;i<newsList.size();i++){
            if(newsList.get(i).getGuid().equals(news1.getGuid())){
                News news2 = new News();
                news2.setGuid(null);
                news2.setTitle("没有了");
                if(i==0){
                    news1.setLastnews(news2);
                }else {
                    news1.setLastnews(newsList.get(i-1));
                }
                if (i==(newsList.size()-1)){
                    news1.setNextnews(news2);
                }else {
                    news1.setNextnews(newsList.get(i+1));
                }
            }
        }
        return new ApiResult<>().success(news1);
    }

    @Override
    public ApiResult addNews(News news) {
        news.setGuid(UUIDUtils.getUuid());
        news.setCreatetime(new Date());
        changeImage(news);
        int i = newsSetMapper.addNews(news);
        addLinkforNews(news);
        return new ApiResult<>().success(i);
    }

    private void addLinkforNews(News news){
        if(news.getMeetingset()!=null&&!StringUtils.isBlank(news.getMeetingset().getGuid())){
            Newsmeetinglink newsmeetinglink = new Newsmeetinglink();
            newsmeetinglink.setGuid(UUIDUtils.getUuid());
            newsmeetinglink.setNewsguid(news.getGuid());
            newsmeetinglink.setMeetingguid(news.getMeetingset().getGuid());
            newsSetMapper.addLink(newsmeetinglink);
        }
    }
    private void delLinkforNews(News news){
        newsSetMapper.delLink(news.getGuid());
    }

    private Meetingset searchMeetingByNews(News news){
        return newsSetMapper.getLink(news.getGuid());
    }

    @Override
    public ApiResult delNews(News news) {
        int i = newsSetMapper.delNews(news);
        delLinkforNews(news);
        return new ApiResult<>().success(i);
    }

    @Override
    public ApiResult changeNews(News news) {
        news.setUpdatetime(new Date());
        changeImage(news);
        int i = newsSetMapper.updateNews(news);
        delLinkforNews(news);
        addLinkforNews(news);
        return new ApiResult<>().success(i);
    }

    @Override
    public String uploadFile(MultipartFile multipartFile, String needCompress) {
        try {
            String fileNewName = UUIDUtils.getUuid();
            String extName = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf(".") + 1);
            String fileName = fileNewName+"."+extName;
            String filePath = bathPath + "/" + fileName;
            File desFile = new File(filePath);
            if(!desFile.getParentFile().exists()){
                desFile.mkdirs();
            }
            multipartFile.transferTo(desFile);
            return fileName;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
