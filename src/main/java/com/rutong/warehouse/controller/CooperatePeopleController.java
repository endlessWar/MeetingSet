package com.rutong.warehouse.controller;

import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.CooperatePeople;
import com.rutong.warehouse.service.ICooperateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 冯怿
 * @since 2019/6/25 10:39
 */
@RestController
@RequestMapping(value="cooperate")
public class CooperatePeopleController {
    @Resource
    private ICooperateService cooperateService;

    @PostMapping("/search_cooperate_list")
    public ApiResult searchCooperateList(@RequestBody CooperatePeople cooperatePeople) {
        try {
            return cooperateService.searchCooperateList(cooperatePeople);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/search_cooperate")
    public ApiResult searchCooperate(@RequestBody CooperatePeople cooperatePeople) {
        try {
            return cooperateService.searchCooperate(cooperatePeople);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/add_cooperate")
    public ApiResult addCooperate(@RequestBody CooperatePeople cooperatePeople) {
        try {
            return cooperateService.addCooperate(cooperatePeople);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("新增失败").failure(e.getMessage());
        }
    }
    public static void main(String[] args){

    }

    @PostMapping("/del_cooperate")
    public ApiResult delCooperate(@RequestBody CooperatePeople cooperatePeople) {
        try {
            return cooperateService.delCooperate(cooperatePeople);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("删除失败").failure(e.getMessage());
        }
    }

    @PostMapping("/change_cooperate")
    public ApiResult changeCooperate(@RequestBody CooperatePeople cooperatePeople) {
        try {
            return cooperateService.changeCooperate(cooperatePeople);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }
}
