package com.rutong.warehouse.controller;

import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.ExpertLibrary;
import com.rutong.warehouse.service.IExpertLibraryService;
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
@RequestMapping("expert_library")
public class ExpertLibraryController {
    @Resource
    private IExpertLibraryService expertLibraryService;

    @PostMapping("/search_expert_library_list")
    public ApiResult searchExpertLibraryList(@RequestBody ExpertLibrary expertLibrary) {
        try {
            return expertLibraryService.searchExpertLibraryList(expertLibrary);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/search_expert_library")
    public ApiResult searchExpertLibrary(@RequestBody ExpertLibrary expertLibrary) {
        try {
            return expertLibraryService.searchExpertLibrary(expertLibrary);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/add_expert_library")
    public ApiResult addExpertLibrary(@RequestBody ExpertLibrary expertLibrary) {
        try {
            return expertLibraryService.addExpertLibrary(expertLibrary);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("新增失败").failure(e.getMessage());
        }
    }
    public static void main(String[] args){

    }

    @PostMapping("/del_expert_library")
    public ApiResult delExpertLibrary(@RequestBody ExpertLibrary expertLibrary) {
        try {
            return expertLibraryService.delExpertLibrary(expertLibrary);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("删除失败").failure(e.getMessage());
        }
    }

    @PostMapping("/change_expert_library")
    public ApiResult changeExpertLibrary(@RequestBody ExpertLibrary expertLibrary) {
        try {
            return expertLibraryService.changeExpertLibrary(expertLibrary);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }
}
