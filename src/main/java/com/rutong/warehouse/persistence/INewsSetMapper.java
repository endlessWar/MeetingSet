package com.rutong.warehouse.persistence;

import com.rutong.warehouse.domain.Meetingset;
import com.rutong.warehouse.domain.News;
import com.rutong.warehouse.domain.Newsmeetinglink;

import java.util.List;

/**
 * @author 冯怿
 * @since 2019/6/18 16:06
 */
public interface INewsSetMapper {
    List<News> searchNewsList(News news);

    News searchNewsById(News news);

    int addNews(News news);

    int delNews(News news);

    int updateNews(News news);

    void addLink(Newsmeetinglink newsmeetinglink);

    void delLink(String guid);

    Meetingset getLink(String guid);

    void setNewsNotImage();

    List<News> searchNewsListLink(News news);

    List<News> searchNewsListAll();
}
