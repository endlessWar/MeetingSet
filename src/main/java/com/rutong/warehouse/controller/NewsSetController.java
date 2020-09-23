package com.rutong.warehouse.controller;

import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.News;
import com.rutong.warehouse.service.IMeetingService;
import com.rutong.warehouse.service.INewsSetService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author 冯怿
 * @since 2019/6/15 22:49
 */
@RestController
@RequestMapping(value="news")
public class NewsSetController {
    @Resource
    private INewsSetService newsSetService;

    @PostMapping("/search_news_list")
    public ApiResult searchNewsList(@RequestBody News news) {
        try {
            return newsSetService.searchNewsList(news);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/search_news_list_back")
    public ApiResult search_news_list_back(@RequestBody News news) {
        try {
            return newsSetService.searchNewsListBack(news);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/search_news")
    public ApiResult searchNews(@RequestBody News news) {
        try {
            return newsSetService.searchNews(news);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/add_news")
    public ApiResult addNews(@RequestBody News news) {
        try {
            return newsSetService.addNews(news);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/del_news")
    public ApiResult delNews(@RequestBody News news) {
        try {
            return newsSetService.delNews(news);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/change_news")
    public ApiResult changeNews(@RequestBody News news) {
        try {
            return newsSetService.changeNews(news);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }


    /**
     * 文件上传接口
     *
     * @param request
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "upload", method = POST)
    public ApiResult<String> upload(MultipartHttpServletRequest request) throws Exception {

        MultipartFile multipartFile = request.getFile("file");
        if (null == multipartFile || multipartFile.isEmpty()) {
            return new ApiResult<String>().failure(500,"文件不能为空",null);
        }

        if (multipartFile.getSize() > 524288000) {
            return new ApiResult<String>().failure(500,"文件过大",null);
        }

        String needCompress = request.getParameter("needCompress");
        if(StringUtils.isBlank(needCompress)){
            needCompress = "Y";
        }

        String str = newsSetService.uploadFile(multipartFile,needCompress);
        return new ApiResult<String>().success(200, "上传成功", str);

    }
}
