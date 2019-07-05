package com.rutong.warehouse.domain;


import java.util.Date;

public class Council extends Query{

  private String guid;
  private String name;
  private String position;
  private String introduce;
  private String place;
  private String postnum;
  private String phonenum;
  private String printpostnum;
  private String interneturl;
  private Date createtime;
  private Integer sort;


  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public String getIntroduce() {
    return introduce;
  }

  public void setIntroduce(String introduce) {
    this.introduce = introduce;
  }


  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }


  public String getPostnum() {
    return postnum;
  }

  public void setPostnum(String postnum) {
    this.postnum = postnum;
  }


  public String getPhonenum() {
    return phonenum;
  }

  public void setPhonenum(String phonenum) {
    this.phonenum = phonenum;
  }


  public String getPrintpostnum() {
    return printpostnum;
  }

  public void setPrintpostnum(String printpostnum) {
    this.printpostnum = printpostnum;
  }


  public String getInterneturl() {
    return interneturl;
  }

  public void setInterneturl(String interneturl) {
    this.interneturl = interneturl;
  }


  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }


  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

}
