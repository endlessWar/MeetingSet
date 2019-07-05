package com.rutong.warehouse.persistence;

import com.rutong.warehouse.domain.CooperatePeople;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 冯怿
 * @since 2019/6/25 10:57
 */
@Repository
@Mapper
public interface ICooperateMapper {
    List<CooperatePeople> searchCooperateList(CooperatePeople cooperatePeople);

    CooperatePeople searchCooperate(CooperatePeople cooperatePeople);

    int addCooperate(CooperatePeople cooperatePeople);

    int delCooperate(CooperatePeople cooperatePeople);

    int changeCooperate(CooperatePeople cooperatePeople);
}
