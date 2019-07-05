package com.rutong.warehouse.domain;

/**
 * @author 冯怿
 * @since 2019/2/10 11:57
 */
public class OneGoodSearchQuery extends BaseSearchQuery {
    private String code;
    private String type;
    private Integer state;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
