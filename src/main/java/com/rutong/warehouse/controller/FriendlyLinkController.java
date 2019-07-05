package com.rutong.warehouse.controller;

import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.FriendlyLink;
import com.rutong.warehouse.service.IFriendlyLinkService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 冯怿
 * @since 2019/6/25 18:00
 */
@RestController
@RequestMapping("link")
public class FriendlyLinkController {
    @Resource
    private IFriendlyLinkService friendlyLinkService;

    @PostMapping("/search_friendlyLink_list")
    public ApiResult searchFriendlyLinkList(@RequestBody FriendlyLink friendlyLink) {
        try {
            return friendlyLinkService.searchFriendlyLinkList(friendlyLink);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/search_friendlyLink")
    public ApiResult searchFriendlyLink(@RequestBody FriendlyLink friendlyLink) {
        try {
            return friendlyLinkService.searchFriendlyLink(friendlyLink);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/add_friendlyLink")
    public ApiResult addFriendlyLink(@RequestBody FriendlyLink friendlyLinkTable) {
        try {
            return friendlyLinkService.addFriendlyLink(friendlyLinkTable);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("新增失败").failure(e.getMessage());
        }
    }
    public static void main(String[] args){

    }

    @PostMapping("/del_friendlyLink")
    public ApiResult delFriendlyLink(@RequestBody FriendlyLink friendlyLinkTable) {
        try {
            return friendlyLinkService.delFriendlyLink(friendlyLinkTable);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("删除失败").failure(e.getMessage());
        }
    }

    @PostMapping("/change_friendlyLink")
    public ApiResult changeFriendlyLink(@RequestBody FriendlyLink friendlyLink) {
        try {
            return friendlyLinkService.changeFriendlyLink(friendlyLink);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }
}
