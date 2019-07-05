package com.rutong.warehouse.domain;

/**
 * @author 冯怿
 * @since 2019/6/25 14:39
 */
public class Query {
    private Integer page = 1;
    private Integer size = 10;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
