package com.rutong.warehouse.domain;


import java.util.AbstractSet;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.WeakHashMap;

public class CooperatePeople extends Query{

  private String guid;
  private String name;
  private String imageurl;
  private Integer sortnum;
  private String url;

  public final void testextends(){
      System.out.println("extends");
  }

    public CooperatePeople() {
    }

    public CooperatePeople(String guid, String name, String imageurl, Integer sortnum, String url) {
        this.guid = guid;
        this.name = name;
        this.imageurl = imageurl;
        this.sortnum = sortnum;
        this.url = url;
    }

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
