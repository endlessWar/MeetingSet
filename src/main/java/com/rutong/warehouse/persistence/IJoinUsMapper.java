package com.rutong.warehouse.persistence;

import com.rutong.warehouse.domain.JoinUs;

import java.util.List;

/**
 * @author 冯怿
 * @since 2019/6/28 19:03
 */
public interface IJoinUsMapper {
    List<JoinUs> searchJoinUsList(JoinUs joinUs);

    JoinUs searchJoinUs(JoinUs joinUs);

    int changeJoinUs(JoinUs joinUs);

    int addJoinUs(JoinUs joinUs);

    int delJoinUs(JoinUs joinUs);
}
