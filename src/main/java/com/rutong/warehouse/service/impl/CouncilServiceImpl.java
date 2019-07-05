package com.rutong.warehouse.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rutong.warehouse.domain.ApiPager;
import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.Council;
import com.rutong.warehouse.persistence.ICouncilMapper;
import com.rutong.warehouse.service.ICouncilService;
import com.rutong.warehouse.utils.UUIDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author 冯怿
 * @since 2019/6/28 18:58
 */
@Service
public class CouncilServiceImpl implements ICouncilService {
    @Resource
    private ICouncilMapper councilMapper;

    @Override
    public ApiResult searchCouncilList(Council council) {
        PageHelper.startPage(council.getPage(), council.getSize(), true);
        Page<Council> page =(Page<Council>) councilMapper.searchCouncilList(council);
        ApiPager<Council> apiPage = new ApiPager<>(page.getPageSize(), page.getPageNum(), page.getTotal(), page.getResult());
        return new ApiResult<>().success(apiPage);
    }

    @Override
    public ApiResult searchCouncil(Council council) {
        Council resultUser = councilMapper.searchCouncil(council);
        return new ApiResult<>().success(resultUser);
    }

    @Override
    public ApiResult changeCouncil(Council council) {
        int i = councilMapper.changeCouncil(council);
        return new ApiResult<>().success(i);
    }

    @Override
    public ApiResult addCouncil(Council council) {
        council.setGuid(UUIDUtils.getUuid());
        council.setCreatetime(new Date());
        int i = councilMapper.addCouncil(council);
        return new ApiResult<>().success(i);
    }

    @Override
    public ApiResult delCouncil(Council council) {
        int i = councilMapper.delCouncil(council);
        return new ApiResult<>().success(i);
    }
}
