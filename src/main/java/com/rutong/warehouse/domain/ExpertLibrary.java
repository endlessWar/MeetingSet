package com.rutong.warehouse.domain;


import java.util.Date;

public class ExpertLibrary extends Query{

  private String guid;
  private String name;
  private String image;
  private String unit;
  private String position;
  private String worktitle;
  private String introduce;
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


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }


  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public String getWorktitle() {
    return worktitle;
  }

  public void setWorktitle(String worktitle) {
    this.worktitle = worktitle;
  }


  public String getIntroduce() {
    return introduce;
  }

  public void setIntroduce(String introduce) {
    this.introduce = introduce;
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
