package com.rutong.warehouse.controller;

import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.JoinUs;
import com.rutong.warehouse.service.IJoinUsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 冯怿
 * @since 2019/6/25 14:30
 */
@RestController
@RequestMapping("join_us")
public class JoinUsController {
    @Resource
    private IJoinUsService joinUsService;

    @PostMapping("/search_join_us_list")
    public ApiResult searchJoinUsList(@RequestBody JoinUs joinUs) {
        try {
            return joinUsService.searchJoinUsList(joinUs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/search_join_us")
    public ApiResult searchJoinUs(@RequestBody JoinUs joinUs) {
        try {
            return joinUsService.searchJoinUs(joinUs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/add_join_us")
    public ApiResult addJoinUs(@RequestBody JoinUs joinUs) {
        try {
            return joinUsService.addJoinUs(joinUs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("新增失败").failure(e.getMessage());
        }
    }
    public static void main(String[] args){

    }

    @PostMapping("/del_join_us")
    public ApiResult delJoinUs(@RequestBody JoinUs joinUs) {
        try {
            return joinUsService.delJoinUs(joinUs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("删除失败").failure(e.getMessage());
        }
    }

    @PostMapping("/change_join_us")
    public ApiResult changeJoinUs(@RequestBody JoinUs joinUs) {
        try {
            return joinUsService.changeJoinUs(joinUs);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }
}
