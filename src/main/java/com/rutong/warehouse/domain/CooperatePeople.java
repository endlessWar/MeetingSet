package com.rutong.warehouse.domain;


public class CooperatePeople extends Query{

  private String guid;
  private String name;
  private String imageurl;
  private Integer sortnum;
  private String url;


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


  public String getImageurl() {
    return imageurl;
  }

  public void setImageurl(String imageurl) {
    this.imageurl = imageurl;
  }


  public Integer getSortnum() {
    return sortnum;
  }

  public void setSortnum(Integer sortnum) {
    this.sortnum = sortnum;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

}
