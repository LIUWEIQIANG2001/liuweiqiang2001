package com.xr.entity;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    private static final long serialVersionUID = 5322798214639699528L;

    private Integer userID;
    private String userName;
    private String password;
    //alt+insert 弹出封装菜单

    private List<Role> rolesUser;

    public List<Role> getRolesUser() {
        return rolesUser;
    }

    public void setRolesUser(List<Role> rolesUser) {
        this.rolesUser = rolesUser;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
