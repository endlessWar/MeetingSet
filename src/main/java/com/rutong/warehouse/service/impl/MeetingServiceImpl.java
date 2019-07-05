package com.rutong.warehouse.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rutong.warehouse.domain.ApiPager;
import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.Meetingset;
import com.rutong.warehouse.domain.Newsmeetinglink;
import com.rutong.warehouse.persistence.IMeetingSetMapper;
import com.rutong.warehouse.service.IMeetingService;
import com.rutong.warehouse.utils.UUIDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author 冯怿
 * @since 2019/6/10 10:17
 */
@Service
public class MeetingServiceImpl implements IMeetingService {
    @Resource
    private IMeetingSetMapper meetingSetMapper;

    @Override
    public ApiResult searchMeetingList(JSONObject jsonObject) {
        Meetingset meetingset = new Meetingset();
        meetingset.setIsback(jsonObject.getInteger("isback"));
        meetingset.setTitle(jsonObject.getString("title"));
        PageHelper.startPage(Integer.parseInt(jsonObject.getString("page")), Integer.parseInt(jsonObject.getString("size")), true);
        System.out.println(meetingset);
        Page<Meetingset> page =(Page<Meetingset>) meetingSetMapper.searchMeetingList(meetingset);
        ApiPager<Meetingset> apiPage = new ApiPager<>(page.getPageSize(), page.getPageNum(), page.getTotal(), page.getResult());
        return new ApiResult<>().success(apiPage);
    }

    @Override
    public ApiResult searchMeeting(Meetingset meetingset) {
        Meetingset resultUser = meetingSetMapper.searchMeeting(meetingset);
        resultUser.setNews(meetingSetMapper.getLinkByMeeting(meetingset.getGuid()));
        return new ApiResult<>().success(resultUser);
    }

    @Override
    public ApiResult addMeeting(Meetingset meetingset) {
        meetingset.setGuid(UUIDUtils.getUuid());
        meetingset.setCreatetime(new Date());
        int i = meetingSetMapper.addMeeting(meetingset);
        linkNews(meetingset);
        return new ApiResult<>().success(i);
    }

    @Override
    public ApiResult delMeeting(Meetingset meetingset) {
        int i = meetingSetMapper.delMeeting(meetingset);
        delLinkNews(meetingset.getGuid());
        return new ApiResult<>().success(i);
    }

    private void delLinkNews(String guid) {
        try {
            meetingSetMapper.delLinkNews(guid);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public ApiResult changeMeeting(Meetingset meetingset) {
        int i = meetingSetMapper.changeMeeting(meetingset);
        delLinkNews(meetingset.getGuid());
        linkNews(meetingset);
        return new ApiResult<>().success(i);
    }

    private void linkNews(Meetingset meetingset) {
        if(meetingset.getNews()!=null&&meetingset.getNews().size()>0){
            meetingset.getNews().forEach(item -> {
                Newsmeetinglink newsmeetinglink = new Newsmeetinglink();
                newsmeetinglink.setGuid(UUIDUtils.getUuid());
                newsmeetinglink.setMeetingguid(meetingset.getGuid());
                newsmeetinglink.setNewsguid(item.getGuid());
                meetingSetMapper.saveLink(newsmeetinglink);
            });
            new ApiResult().success();
        }else {
            new ApiResult().failure("没有绑定新闻");
        }
    }
}
