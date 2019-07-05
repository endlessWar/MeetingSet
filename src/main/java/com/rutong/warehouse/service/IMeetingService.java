package com.rutong.warehouse.service;

import com.alibaba.fastjson.JSONObject;
import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.Meetingset;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 冯怿
 * @since 2019/6/10 10:13
 */
public interface IMeetingService {

    ApiResult searchMeetingList(JSONObject jsonObject);

    ApiResult searchMeeting(Meetingset meetingset);

    ApiResult addMeeting(Meetingset meetingset);

    ApiResult delMeeting(Meetingset meetingset);

    ApiResult changeMeeting(Meetingset meetingset);

}
