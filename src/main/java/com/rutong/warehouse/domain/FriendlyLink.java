package com.rutong.warehouse.domain;


public class FriendlyLink extends Query{

  private String guid;
  private String name;
  private String url;
  private int sort;


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


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public int getSort() {
    return sort;
  }

  public void setSort(int sort) {
    this.sort = sort;
  }
}
