package com.rutong.warehouse.controller;

import com.alibaba.fastjson.JSONObject;
import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.UserManager;
import com.rutong.warehouse.service.IUserBaseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 冯怿
 * @since 2019/5/22 13:41
 */
@RestController
@RequestMapping(value="operalog")
public class UserBaseController {
    @Resource
    private IUserBaseService userBaseService;

    @PostMapping("/search_users")
    public ApiResult searchusers(@RequestBody JSONObject jsonObject) {
        try {
            return userBaseService.searchusers(jsonObject);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/searchuserinfo")
    public ApiResult searchuserinfo(@RequestBody UserManager userManager) {
        try {
            return userBaseService.searchuserinfo(userManager);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("查询失败").failure(e.getMessage());
        }
    }

    @PostMapping("/addusers")
    public ApiResult addusers(@RequestBody UserManager userManager) {
        try {
            return userBaseService.addusers(userManager);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("注册失败").failure(e.getMessage());
        }
    }

    @PostMapping("/updateusers")
    public ApiResult updateusers(@RequestBody UserManager userManager) {
        try {
            return userBaseService.updateusers(userManager);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("更新失败").failure(e.getMessage());
        }
    }

    @PostMapping("/delusers")
    public ApiResult delusers(@RequestBody UserManager userManager) {
        try {
            return userBaseService.delusers(userManager);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("删除失败").failure(e.getMessage());
        }
    }

    @PostMapping("/log")
    public ApiResult userlog(@RequestBody UserManager userManager) {
        try {
            return userBaseService.logs(userManager);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("登陆失败").failure(e.getMessage());
        }
    }

    @PostMapping("/getcanUse")
    public ApiResult getcanUse(@RequestBody UserManager userManager) {
        try {
            return userBaseService.getcanUse(userManager);
        } catch (Exception e) {
            e.printStackTrace();
            return new ApiResult("登陆失败").failure(e.getMessage());
        }
    }
}
