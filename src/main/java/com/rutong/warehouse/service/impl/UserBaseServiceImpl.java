package com.rutong.warehouse.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.UserManager;
import com.rutong.warehouse.persistence.IUserBaseMapper;
import com.rutong.warehouse.service.IUserBaseService;
import com.rutong.warehouse.utils.UUIDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author 冯怿
 * @since 2019/5/22 13:48
 */
@Service
public class UserBaseServiceImpl implements IUserBaseService {
    @Resource
    private IUserBaseMapper userBaseMapper;

    @Override
    public ApiResult searchusers(JSONObject jsonObject) {
        PageHelper.startPage(Integer.parseInt(jsonObject.getString("page")), Integer.parseInt(jsonObject.getString("size")), true);
        List<UserManager> list = userBaseMapper.searchusers(jsonObject.getString("word"));
        return new ApiResult<>().success(list);
    }

    @Override
    public ApiResult addusers(UserManager userManager) {
        userManager.setGuid(UUIDUtils.getUuid());
        userManager.setCreatetime(new Date());
        UserManager k = userBaseMapper.getUserByAccount(userManager);
        if(k != null){
            return new ApiResult().failure("账号重复，请重新输入账号");
        }
        int i = userBaseMapper.addUser(userManager);
        return new ApiResult<>().success(i);
    }

    @Override
    public ApiResult updateusers(UserManager userManager) {
        int i = userBaseMapper.updateUser(userManager);
        return new ApiResult<>().success(i);
    }

    @Override
    public ApiResult delusers(UserManager userManager) {
        int i = userBaseMapper.delUser(userManager);
        userBaseMapper.delLinkByUser(userManager);
        return new ApiResult<>().success(i);
    }

    @Override
    public ApiResult searchuserinfo(UserManager userManager) {
        UserManager resultUser = userBaseMapper.getUserInfo(userManager);
        return new ApiResult<>().success(resultUser);
    }

    @Override
    public ApiResult logs(UserManager userManager) {
        if(userManager.getPassword().equals(userBaseMapper.getPassword(userManager))){
            return new ApiResult().success("登陆成功");
        }
        return new ApiResult().failure("登陆失败");
    }

    @Override
    public ApiResult getcanUse(UserManager userManager) {
        return null;
    }
}
