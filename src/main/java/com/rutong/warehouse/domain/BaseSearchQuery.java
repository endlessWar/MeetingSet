package com.rutong.warehouse.domain;

/**
 * @author 冯怿
 * @since 2019/2/10 11:51
 */
public class BaseSearchQuery {
    private Integer pi = 1;
    private Integer ps = 10;

    public Integer getPs() {
        return ps;
    }

    public void setPs(Integer ps) {
        this.ps = ps;
    }

    public Integer getPi() {

        return pi;
    }

    public void setPi(Integer pi) {
        this.pi = pi;
    }
}
