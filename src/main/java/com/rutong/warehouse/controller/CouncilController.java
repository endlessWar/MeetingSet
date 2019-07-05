package com.rutong.warehouse.controller;

import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.Council;
import com.rutong.warehouse.service.ICouncilService;
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
@RequestMapping("council")
public class CouncilController {
    @Resource
    private ICouncilService councilService;

    @PostMapping("/search_council_list")
    public ApiResult searchCouncilList(@RequestBody Council council) {
        try {
            return councilService.searchCouncilList(council);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/search_council")
    public ApiResult searchCouncil(@RequestBody Council council) {
        try {
            return councilService.searchCouncil(council);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/add_council")
    public ApiResult addCouncil(@RequestBody Council council) {
        try {
            return councilService.addCouncil(council);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("新增失败").failure(e.getMessage());
        }
    }
    public static void main(String[] args){

    }

    @PostMapping("/del_council")
    public ApiResult delCouncil(@RequestBody Council council) {
        try {
            return councilService.delCouncil(council);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("删除失败").failure(e.getMessage());
        }
    }

    @PostMapping("/change_council")
    public ApiResult changeCouncil(@RequestBody Council council) {
        try {
            return councilService.changeCouncil(council);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }
}
