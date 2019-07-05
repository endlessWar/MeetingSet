package com.rutong.warehouse.controller;

import com.alibaba.fastjson.JSONObject;
import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.Meetingset;
import com.rutong.warehouse.service.IMeetingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 冯怿
 * @since 2019/6/10 9:53
 */
@RestController
@RequestMapping(value="meeting")
public class MeetingSetController {
    @Resource
    private IMeetingService meetingService;

    @PostMapping("/search_meeting_list")
    public ApiResult searchMeetingList(@RequestBody JSONObject jsonObject) {
        try {
            return meetingService.searchMeetingList(jsonObject);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/search_meeting")
    public ApiResult searchMeeting(@RequestBody Meetingset meetingset) {
        try {
            return meetingService.searchMeeting(meetingset);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/add_meeting")
    public ApiResult addMeeting(@RequestBody Meetingset meetingset) {
        try {
            return meetingService.addMeeting(meetingset);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("新增失败").failure(e.getMessage());
        }
    }
    public static void main(String[] args){

    }

    @PostMapping("/del_meeting")
    public ApiResult delMeeting(@RequestBody Meetingset meetingset) {
        try {
            return meetingService.delMeeting(meetingset);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("删除失败").failure(e.getMessage());
        }
    }

    @PostMapping("/change_meeting")
    public ApiResult changeMeeting(@RequestBody Meetingset meetingset) {
        try {
            return meetingService.changeMeeting(meetingset);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

}
