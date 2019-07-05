package com.rutong.warehouse.persistence;

import com.rutong.warehouse.domain.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author 冯怿
 * @since 2019/2/7 11:01
 */
@Repository
public interface IGoodsMapper {
    /**
     * 添加商品信息
     * @param goods 商品
     * @return 添加条数
     */
    int insertGoods(Goods goods);

    Goods getGoodsbyCode(@Param("code") String code);
}
