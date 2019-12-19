package com.xr.entity;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable {
    private static final long serialVersionUID = -6987824567262991390L;
    private Integer rid;
    private String roleName;
    private List<Permission> perms;

    public List<Permission> getPerms() {
        return perms;
    }

    public void setPerms(List<Permission> perms) {
        this.perms = perms;
    }


    public Role(){}

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
