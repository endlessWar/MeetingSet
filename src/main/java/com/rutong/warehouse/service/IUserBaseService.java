package com.rutong.warehouse.service;

import com.alibaba.fastjson.JSONObject;
import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.UserManager;

/**
 * @author 冯怿
 * @since 2019/5/22 13:46
 */
public interface IUserBaseService {
    ApiResult searchusers(JSONObject jsonObject);

    ApiResult addusers(UserManager userManager);

    ApiResult updateusers(UserManager userManager);

    ApiResult delusers(UserManager userManager);

    ApiResult searchuserinfo(UserManager userManager);

    ApiResult logs(UserManager userManager);

    ApiResult getcanUse(UserManager userManager);
}
