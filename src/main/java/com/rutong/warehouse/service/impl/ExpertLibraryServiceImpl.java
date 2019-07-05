package com.rutong.warehouse.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rutong.warehouse.domain.ApiPager;
import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.ExpertLibrary;
import com.rutong.warehouse.persistence.IExpertLibraryMapper;
import com.rutong.warehouse.service.IExpertLibraryService;
import com.rutong.warehouse.utils.UUIDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author 冯怿
 * @since 2019/6/28 18:59
 */
@Service
public class ExpertLibraryServiceImpl implements IExpertLibraryService {
    @Resource
    private IExpertLibraryMapper expertLibraryMapper;

    @Override
    public ApiResult searchExpertLibraryList(ExpertLibrary expertLibrary) {
        PageHelper.startPage(expertLibrary.getPage(), expertLibrary.getSize(), true);
        Page<ExpertLibrary> page =(Page<ExpertLibrary>) expertLibraryMapper.searchExpertLibraryList(expertLibrary);
        ApiPager<ExpertLibrary> apiPage = new ApiPager<>(page.getPageSize(), page.getPageNum(), page.getTotal(), page.getResult());
        return new ApiResult<>().success(apiPage);
    }

    @Override
    public ApiResult searchExpertLibrary(ExpertLibrary expertLibrary) {
        ExpertLibrary resultUser = expertLibraryMapper.searchExpertLibrary(expertLibrary);
        return new ApiResult<>().success(resultUser);
    }

    @Override
    public ApiResult changeExpertLibrary(ExpertLibrary expertLibrary) {
        int i = expertLibraryMapper.changeExpertLibrary(expertLibrary);
        return new ApiResult<>().success(i);
    }

    @Override
    public ApiResult addExpertLibrary(ExpertLibrary expertLibrary) {
        expertLibrary.setGuid(UUIDUtils.getUuid());
        expertLibrary.setCreatetime(new Date());
        int i = expertLibraryMapper.addExpertLibrary(expertLibrary);
        return new ApiResult<>().success(i);
    }

    @Override
    public ApiResult delExpertLibrary(ExpertLibrary expertLibrary) {
        int i = expertLibraryMapper.delExpertLibrary(expertLibrary);
        return new ApiResult<>().success(i);
    }
}
