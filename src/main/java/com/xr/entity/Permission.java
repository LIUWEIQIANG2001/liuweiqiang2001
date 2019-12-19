package com.xr.entity;

import java.io.Serializable;
import java.util.List;

public class Permission implements Serializable {
    private static final long serialVersionUID = -755162491504295859L;
    private Integer pid;
    private String permName;
    private String url;

    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Permission(){}

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPermName() {
        return permName;
    }

    public void setPermName(String permName) {
        this.permName = permName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "pid=" + pid +
                ", permName='" + permName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
