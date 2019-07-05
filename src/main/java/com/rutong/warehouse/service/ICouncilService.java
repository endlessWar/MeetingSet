package com.rutong.warehouse.service;

import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.Council;

/**
 * @author 冯怿
 * @since 2019/6/28 18:54
 */
public interface ICouncilService {
    ApiResult searchCouncilList(Council council);

    ApiResult searchCouncil(Council council);

    ApiResult addCouncil(Council council);

    ApiResult delCouncil(Council council);

    ApiResult changeCouncil(Council council);
}
