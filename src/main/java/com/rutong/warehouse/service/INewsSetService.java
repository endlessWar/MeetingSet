package com.rutong.warehouse.service;

import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.News;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 冯怿
 * @since 2019/6/15 22:54
 */
public interface INewsSetService {
    ApiResult searchNewsList(News news);

    ApiResult searchNews(News news);

    ApiResult addNews(News news);

    ApiResult delNews(News news);

    ApiResult changeNews(News news);

    String uploadFile(MultipartFile multipartFile, String needCompress);
}
