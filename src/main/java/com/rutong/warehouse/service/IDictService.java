package com.rutong.warehouse.service;

import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.DictTable;

/**
 * @author 冯怿
 * @since 2019/6/25 14:34
 */
public interface IDictService {
    ApiResult searchDictList(DictTable dict);

    ApiResult searchDict(DictTable dict);

    ApiResult changeDict(DictTable dict);

    ApiResult addDict(DictTable dictTable);

    ApiResult delDict(DictTable dictTable);
}
