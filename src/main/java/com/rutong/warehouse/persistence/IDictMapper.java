package com.rutong.warehouse.persistence;

import com.rutong.warehouse.domain.DictTable;

import java.util.List;

/**
 * @author 冯怿
 * @since 2019/6/25 14:44
 */
public interface IDictMapper {
    List<DictTable> searchDictList(DictTable dict);

    DictTable searchDict(DictTable dict);

    int addDict(DictTable dict);

    int delDict(DictTable dictTable);

    int changeDict(DictTable dictTable);
}
