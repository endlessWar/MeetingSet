package com.rutong.warehouse.domain;


import java.util.ArrayList;
import java.util.Date;

public class Meetingset {

  private String guid;
  private String title;
  private String meeting;
  private Integer isback = 0;
  private Date createtime;
  private String createuser;
  private String img;
  private String discrib;
  private String linkurl;
  private ArrayList<News> news;


  public String getLinkurl() {
    return linkurl;
  }

  public void setLinkurl(String linkurl) {
    this.linkurl = linkurl;
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

  public String getMeeting() {
    return meeting;
  }

  public void setMeeting(String meeting) {
    this.meeting = meeting;
  }


  public Integer getIsback() {
    return isback;
  }

  public void setIsback(Integer isback) {
    this.isback = isback;
  }


  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }


  public String getCreateuser() {
    return createuser;
  }

  public void setCreateuser(String createuser) {
    this.createuser = createuser;
  }

  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

  public String getDiscrib() {
    return discrib;
  }

  public void setDiscrib(String discrib) {
    this.discrib = discrib;
  }

  public ArrayList<News> getNews() {
    return news;
  }

  public void setNews(ArrayList<News> news) {
    this.news = news;
  }

  @Override
  public String toString() {
    return "Meetingset{" +
            "guid='" + guid + '\'' +
            ", title='" + title + '\'' +
            ", meeting='" + meeting + '\'' +
            ", isback=" + isback +
            ", createtime=" + createtime +
            ", createuser='" + createuser + '\'' +
            ", img='" + img + '\'' +
            ", discrib='" + discrib + '\'' +
            ", news=" + news +
            '}';
  }
}
