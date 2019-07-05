package com.rutong.warehouse.service;

import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.ExpertLibrary;

/**
 * @author 冯怿
 * @since 2019/6/28 18:54
 */
public interface IExpertLibraryService {
    ApiResult searchExpertLibraryList(ExpertLibrary expertLibrary);

    ApiResult searchExpertLibrary(ExpertLibrary expertLibrary);

    ApiResult addExpertLibrary(ExpertLibrary expertLibrary);

    ApiResult delExpertLibrary(ExpertLibrary expertLibrary);

    ApiResult changeExpertLibrary(ExpertLibrary expertLibrary);
}
