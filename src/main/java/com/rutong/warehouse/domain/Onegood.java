package com.rutong.warehouse.domain;


public class Onegood {

  private String guid;
  private String code;
  private String type;
  private long state;
  private java.sql.Timestamp createtime;
  private String createpeople;
  private java.sql.Timestamp sellouttime;
  private String selloutpeople;
  private double sellprice;


  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }


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


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
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


  public java.sql.Timestamp getSellouttime() {
    return sellouttime;
  }

  public void setSellouttime(java.sql.Timestamp sellouttime) {
    this.sellouttime = sellouttime;
  }


  public String getSelloutpeople() {
    return selloutpeople;
  }

  public void setSelloutpeople(String selloutpeople) {
    this.selloutpeople = selloutpeople;
  }


  public double getSellprice() {
    return sellprice;
  }

  public void setSellprice(double sellprice) {
    this.sellprice = sellprice;
  }

}
