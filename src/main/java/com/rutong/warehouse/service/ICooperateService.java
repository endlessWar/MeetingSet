package com.rutong.warehouse.service;

import com.rutong.warehouse.domain.ApiResult;
import com.rutong.warehouse.domain.CooperatePeople;

/**
 * @author 冯怿
 * @since 2019/6/25 10:46
 */
public interface ICooperateService {
    /**
     * 查询合作商列表
     * @param cooperatePeople 参数
     * @return 是否成功
     */
    ApiResult searchCooperateList(CooperatePeople cooperatePeople);

    /**
     * 查询合作商
     * @param cooperatePeople 参数
     * @return 是否成功
     */
    ApiResult searchCooperate(CooperatePeople cooperatePeople);

    /**
     * 添加合作商
     * @param cooperatePeople 参数
     * @return 是否成功
     */
    ApiResult addCooperate(CooperatePeople cooperatePeople);

    /**
     * 删除合作商
     * @param cooperatePeople 参数
     * @return 是否成功
     */
    ApiResult delCooperate(CooperatePeople cooperatePeople);

    /**
     * 修改合作商
     * @param cooperatePeople 参数
     * @return 是否成功
     */
    ApiResult changeCooperate(CooperatePeople cooperatePeople);
}
