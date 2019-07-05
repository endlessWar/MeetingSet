package com.rutong.warehouse.domain;

/**
 * @author 冯怿
 * @since 2019/2/10 11:58
 */
public class DeptSearchQuery extends BaseSearchQuery {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
