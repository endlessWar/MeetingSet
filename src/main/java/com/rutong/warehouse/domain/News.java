package com.rutong.warehouse.domain;

import java.util.Date;

public class News extends Query{

  private String guid;
  private String title;
  private String inner;
  private Date createtime;
  private Date updatetime;
  private String createuser;
  private String updateuser;
  private String imageurl;
  private Integer isimage;
  private Integer totop;
  private Integer type;
  private Meetingset meetingset;
  private News lastnews;
  private News nextnews;
  private Integer isanli;
  private boolean haslink = false;
  private String discrib;

  public String getDiscrib() {
    return discrib;
  }

  public void setDiscrib(String discrib) {
    this.discrib = discrib;
  }

  public Integer getIsanli() {
    return isanli;
  }

  public void setIsanli(Integer isanli) {
    this.isanli = isanli;
  }

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


  public String getInner() {
    return inner;
  }

  public void setInner(String inner) {
    this.inner = inner;
  }


  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }


  public Date getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(Date updatetime) {
    this.updatetime = updatetime;
  }


  public String getCreateuser() {
    return createuser;
  }

  public void setCreateuser(String createuser) {
    this.createuser = createuser;
  }


  public String getUpdateuser() {
    return updateuser;
  }

  public void setUpdateuser(String updateuser) {
    this.updateuser = updateuser;
  }


  public String getImageurl() {
    return imageurl;
  }

  public void setImageurl(String imageurl) {
    this.imageurl = imageurl;
  }


  public Integer getIsimage() {
    return isimage;
  }

  public void setIsimage(Integer isimage) {
    this.isimage = isimage;
  }


  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public Integer getTotop() {

    return totop;
  }

  public void setTotop(Integer totop) {
    this.totop = totop;
  }

  public Meetingset getMeetingset() {
    return meetingset;
  }

  public void setMeetingset(Meetingset meetingset) {
    this.meetingset = meetingset;
  }

  public boolean isHaslink() {
    return haslink;
  }

  public void setHaslink(boolean haslink) {
    this.haslink = haslink;
  }

  public News getLastnews() {
    return lastnews;
  }

  public void setLastnews(News lastnews) {
    this.lastnews = lastnews;
  }

  public News getNextnews() {
    return nextnews;
  }

  public void setNextnews(News nextnews) {
    this.nextnews = nextnews;
  }
}
