package com.rutong.warehouse.persistence;

import com.rutong.warehouse.domain.Council;

import java.util.List;

/**
 * @author 冯怿
 * @since 2019/6/28 19:03
 */
public interface ICouncilMapper {
    List<Council> searchCouncilList(Council council);

    Council searchCouncil(Council council);

    int changeCouncil(Council council);

    int addCouncil(Council council);

    int delCouncil(Council council);
}
