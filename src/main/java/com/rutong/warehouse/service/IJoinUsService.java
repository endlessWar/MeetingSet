package com.rutong.warehouse.service;

import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.JoinUs;

/**
 * @author 冯怿
 * @since 2019/6/28 18:55
 */
public interface IJoinUsService {
    ApiResult searchJoinUsList(JoinUs joinUs);

    ApiResult searchJoinUs(JoinUs joinUs);

    ApiResult addJoinUs(JoinUs joinUs);

    ApiResult delJoinUs(JoinUs joinUs);

    ApiResult changeJoinUs(JoinUs joinUs);
}
