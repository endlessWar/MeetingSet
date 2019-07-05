package com.rutong.warehouse.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rutong.warehouse.domain.ApiPager;
import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.CooperatePeople;
import com.rutong.warehouse.persistence.ICooperateMapper;
import com.rutong.warehouse.service.ICooperateService;
import com.rutong.warehouse.utils.UUIDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 冯怿
 * @since 2019/6/25 10:49
 */
@Service
public class CooperateServiceImpl implements ICooperateService {
    @Resource
    private ICooperateMapper cooperateMapper;

    @Override
    public ApiResult searchCooperateList(CooperatePeople cooperatePeople) {
        PageHelper.startPage(cooperatePeople.getPage(), cooperatePeople.getSize(), true);
        Page<CooperatePeople> page =(Page<CooperatePeople>) cooperateMapper.searchCooperateList(cooperatePeople);
        ApiPager<CooperatePeople> apiPage = new ApiPager<>(page.getPageSize(), page.getPageNum(), page.getTotal(), page.getResult());
        return new ApiResult<>().success(apiPage);
    }

    @Override
    public ApiResult searchCooperate(CooperatePeople cooperatePeople) {
        CooperatePeople resultUser = cooperateMapper.searchCooperate(cooperatePeople);
        return new ApiResult<>().success(resultUser);
    }

    @Override
    public ApiResult addCooperate(CooperatePeople cooperatePeople) {
        cooperatePeople.setGuid(UUIDUtils.getUuid());
        int i = cooperateMapper.addCooperate(cooperatePeople);
        return new ApiResult<>().success(i);
    }

    @Override
    public ApiResult delCooperate(CooperatePeople cooperatePeople) {
        int i = cooperateMapper.delCooperate(cooperatePeople);
        return new ApiResult<>().success(i);
    }

    @Override
    public ApiResult changeCooperate(CooperatePeople cooperatePeople) {
        int i = cooperateMapper.changeCooperate(cooperatePeople);
        return new ApiResult<>().success(i);
    }
}
