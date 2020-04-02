package com.chao.springbootdemo.user.entities;

import java.util.Date;

public class User {

    private int id;
    private String username;
    private String password;
    private Date gmt_create;
    private int status;

    public User() {
    }

    public User(int id, String username, String password, Date gmt_create, int status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.gmt_create = gmt_create;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getGmtCreate() {
        return gmt_create;
    }

    public void setGmtCreate(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gmtCreate=" + gmt_create +
                ", status=" + status +
                '}';
    }
}