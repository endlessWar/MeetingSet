package com.rutong.warehouse.domain;


public class ReportValue {

  private String guid;
  private String title;
  private String message;
  private String createuserid;
  private String createusername;
  private java.sql.Timestamp createtime;
  private String updateuserid;
  private String updateusername;
  private java.sql.Timestamp updatetime;
  private java.sql.Timestamp startReportTime;
  private java.sql.Timestamp endReportTime;
  private String maxReportNum;


  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  public String getCreateuserid() {
    return createuserid;
  }

  public void setCreateuserid(String createuserid) {
    this.createuserid = createuserid;
  }


  public String getCreateusername() {
    return createusername;
  }

  public void setCreateusername(String createusername) {
    this.createusername = createusername;
  }


  public java.sql.Timestamp getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Timestamp createtime) {
    this.createtime = createtime;
  }


  public String getUpdateuserid() {
    return updateuserid;
  }

  public void setUpdateuserid(String updateuserid) {
    this.updateuserid = updateuserid;
  }


  public String getUpdateusername() {
    return updateusername;
  }

  public void setUpdateusername(String updateusername) {
    this.updateusername = updateusername;
  }


  public java.sql.Timestamp getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(java.sql.Timestamp updatetime) {
    this.updatetime = updatetime;
  }


  public java.sql.Timestamp getStartReportTime() {
    return startReportTime;
  }

  public void setStartReportTime(java.sql.Timestamp startReportTime) {
    this.startReportTime = startReportTime;
  }


  public java.sql.Timestamp getEndReportTime() {
    return endReportTime;
  }

  public void setEndReportTime(java.sql.Timestamp endReportTime) {
    this.endReportTime = endReportTime;
  }


  public String getMaxReportNum() {
    return maxReportNum;
  }

  public void setMaxReportNum(String maxReportNum) {
    this.maxReportNum = maxReportNum;
  }

}
