package com.rutong.warehouse.persistence;

import com.rutong.warehouse.domain.Meetingset;

import java.util.ArrayList;
import java.util.List;

import com.rutong.warehouse.domain.News;
import com.rutong.warehouse.domain.Newsmeetinglink;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author 冯怿
 * @since 2019/6/10 10:32
 */
@Repository
@Mapper
public interface IMeetingSetMapper {
    List<Meetingset> searchMeetingList(Meetingset meetingset);

    Meetingset searchMeeting(Meetingset meetingset);

    int addMeeting(Meetingset meetingset);

    int delMeeting(Meetingset meetingset);

    int changeMeeting(Meetingset meetingset);

    void saveLink(Newsmeetinglink newsmeetinglink);

    ArrayList<News> getLinkByMeeting(String guid);

    void delLinkNews(String guid);
}
