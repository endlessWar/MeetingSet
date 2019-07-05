package com.rutong.warehouse.domain;

import java.util.Date;

/**
 * @author 冯怿
 * @since 2019/2/10 12:01
 */
public class OperalogSearchQuery {
    private String code;
    private String account;
    private Date startTime;
    private Date endTime;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
