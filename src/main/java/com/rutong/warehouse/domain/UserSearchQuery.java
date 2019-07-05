package com.rutong.warehouse.domain;

/**
 * @author 冯怿
 * @since 2019/2/10 12:00
 */
public class UserSearchQuery extends BaseSearchQuery {
    private String name;
    private String account;
    private String dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
