package com.rutong.warehouse.domain;


import java.util.Date;

public class JoinUs extends Query{

  private String guid;
  private String work;
  private Integer peoplenum;
  private String workplace;
  private String content;
  private Date createtime;


  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }


  public String getWork() {
    return work;
  }

  public void setWork(String work) {
    this.work = work;
  }


  public Integer getPeoplenum() {
    return peoplenum;
  }

  public void setPeoplenum(Integer peoplenum) {
    this.peoplenum = peoplenum;
  }


  public String getWorkplace() {
    return workplace;
  }

  public void setWorkplace(String workplace) {
    this.workplace = workplace;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }

}
