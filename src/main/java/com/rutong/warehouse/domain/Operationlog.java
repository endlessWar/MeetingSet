package com.rutong.warehouse.domain;


public class Operationlog {

  private String guid;
  private java.sql.Timestamp createtime;
  private String createpeople;
  private String operation;
  private String goodsguid;


  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }


  public java.sql.Timestamp getCreatetime() {
    return createtime;
  }

  public void setCreatetime(java.sql.Timestamp createtime) {
    this.createtime = createtime;
  }


  public String getCreatepeople() {
    return createpeople;
  }

  public void setCreatepeople(String createpeople) {
    this.createpeople = createpeople;
  }


  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }


  public String getGoodsguid() {
    return goodsguid;
  }

  public void setGoodsguid(String goodsguid) {
    this.goodsguid = goodsguid;
  }

}
