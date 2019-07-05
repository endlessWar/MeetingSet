package com.rutong.warehouse.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rutong.warehouse.domain.ApiPager;
import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.JoinUs;
import com.rutong.warehouse.persistence.IJoinUsMapper;
import com.rutong.warehouse.service.IJoinUsService;
import com.rutong.warehouse.utils.UUIDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author 冯怿
 * @since 2019/6/28 19:00
 */
@Service
public class JoinUsServiceImpl implements IJoinUsService {
    @Resource
    private IJoinUsMapper joinUsMapper;

    @Override
    public ApiResult searchJoinUsList(JoinUs joinUs) {
        PageHelper.startPage(joinUs.getPage(), joinUs.getSize(), true);
        Page<JoinUs> page =(Page<JoinUs>) joinUsMapper.searchJoinUsList(joinUs);
        ApiPager<JoinUs> apiPage = new ApiPager<>(page.getPageSize(), page.getPageNum(), page.getTotal(), page.getResult());
        return new ApiResult<>().success(apiPage);
    }

    @Override
    public ApiResult searchJoinUs(JoinUs joinUs) {
        JoinUs resultUser = joinUsMapper.searchJoinUs(joinUs);
        return new ApiResult<>().success(resultUser);
    }

    @Override
    public ApiResult changeJoinUs(JoinUs joinUs) {
        int i = joinUsMapper.changeJoinUs(joinUs);
        return new ApiResult<>().success(i);
    }

    @Override
    public ApiResult addJoinUs(JoinUs joinUs) {
        joinUs.setGuid(UUIDUtils.getUuid());
        joinUs.setCreatetime(new Date());
        int i = joinUsMapper.addJoinUs(joinUs);
        return new ApiResult<>().success(i);
    }

    @Override
    public ApiResult delJoinUs(JoinUs joinUs) {
        int i = joinUsMapper.delJoinUs(joinUs);
        return new ApiResult<>().success(i);
    }
}
