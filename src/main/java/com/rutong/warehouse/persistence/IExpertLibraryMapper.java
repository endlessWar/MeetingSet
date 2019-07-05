package com.rutong.warehouse.persistence;

import com.rutong.warehouse.domain.ExpertLibrary;

import java.util.List;

/**
 * @author 冯怿
 * @since 2019/6/28 19:03
 */
public interface IExpertLibraryMapper {
    List<ExpertLibrary> searchExpertLibraryList(ExpertLibrary expertLibrary);

    ExpertLibrary searchExpertLibrary(ExpertLibrary expertLibrary);

    int changeExpertLibrary(ExpertLibrary expertLibrary);

    int addExpertLibrary(ExpertLibrary expertLibrary);

    int delExpertLibrary(ExpertLibrary expertLibrary);
}
