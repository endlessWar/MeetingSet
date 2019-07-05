package com.rutong.warehouse.domain;


import java.util.Date;

public class UserManager {

  private String guid;
  private String useraccount;
  private String username;
  private String phone;
  private String mail;
  private String password;
  private String birthday;
  private String sex;
  private Date createtime;
  private Date updatetime;


  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUseraccount() {
    return useraccount;
  }

  public void setUseraccount(String useraccount) {
    this.useraccount = useraccount;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }


  public String getPassword() {
    if(password!=null){
      return password;
    }else {
      return "";
    }
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
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

}
