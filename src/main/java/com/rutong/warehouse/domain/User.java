package com.rutong.warehouse.domain;


public class User {

  private String guid;
  private String name;
  private String account;
  private String password;
  private String userdept;
  private String role;


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


  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getUserdept() {
    return userdept;
  }

  public void setUserdept(String userdept) {
    this.userdept = userdept;
  }


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

}
