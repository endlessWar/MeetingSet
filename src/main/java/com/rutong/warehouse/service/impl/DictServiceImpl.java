package com.rutong.warehouse.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.rutong.warehouse.domain.ApiPager;
import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.DictTable;
import com.rutong.warehouse.persistence.IDictMapper;
import com.rutong.warehouse.service.IDictService;
import com.rutong.warehouse.utils.UUIDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 冯怿
 * @since 2019/6/25 14:36
 */
@Service
public class DictServiceImpl implements IDictService {
    @Resource
    private IDictMapper dictMapper;
    
    @Override
    public ApiResult searchDictList(DictTable dict) {
        PageHelper.startPage(dict.getPage(), dict.getSize(), true);
        Page<DictTable> page =(Page<DictTable>) dictMapper.searchDictList(dict);
        ApiPager<DictTable> apiPage = new ApiPager<>(page.getPageSize(), page.getPageNum(), page.getTotal(), page.getResult());
        return new ApiResult<>().success(apiPage);
    }

    @Override
    public ApiResult searchDict(DictTable dict) {
        DictTable resultUser = dictMapper.searchDict(dict);
        return new ApiResult<>().success(resultUser);
    }

    @Override
    public ApiResult changeDict(DictTable dict) {
        int i = dictMapper.changeDict(dict);
        return new ApiResult<>().success(i);
    }

    @Override
    public ApiResult addDict(DictTable dictTable) {
        dictTable.setGuid(UUIDUtils.getUuid());
        int i = dictMapper.addDict(dictTable);
        return new ApiResult<>().success(i);
    }

    @Override
    public ApiResult delDict(DictTable dictTable) {
        int i = dictMapper.delDict(dictTable);
        return new ApiResult<>().success(i);
    }
}
