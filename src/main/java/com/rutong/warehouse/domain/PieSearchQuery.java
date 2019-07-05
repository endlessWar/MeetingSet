package com.rutong.warehouse.domain;

import java.util.Date;

/**
 * @author 冯怿
 * @since 2019/2/10 11:53
 */
public class PieSearchQuery {
    private Integer state;
    private String userId;
    private Date startTime;
    private Date endTime;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
