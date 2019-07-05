package com.rutong.warehouse.controller;

import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.DictTable;
import com.rutong.warehouse.service.IDictService;
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
@RequestMapping("dict")
public class DictController {
    @Resource
    private IDictService dictService;

    @PostMapping("/search_dict_list")
    public ApiResult searchDictList(@RequestBody DictTable dict) {
        try {
            return dictService.searchDictList(dict);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/search_dict")
    public ApiResult searchDict(@RequestBody DictTable dict) {
        try {
            return dictService.searchDict(dict);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/add_dict")
    public ApiResult addDict(@RequestBody DictTable dictTable) {
        try {
            return dictService.addDict(dictTable);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("新增失败").failure(e.getMessage());
        }
    }
    public static void main(String[] args){

    }

    @PostMapping("/del_dict")
    public ApiResult delDict(@RequestBody DictTable dictTable) {
        try {
            return dictService.delDict(dictTable);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("删除失败").failure(e.getMessage());
        }
    }

    @PostMapping("/change_dict")
    public ApiResult changeDict(@RequestBody DictTable dict) {
        try {
            return dictService.changeDict(dict);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }
}
