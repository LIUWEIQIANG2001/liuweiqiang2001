package com.xr.entity;

import java.io.Serializable;
import java.util.List;

public class Clazz implements Serializable {
    private static final long serialVersionUID = 6618754781939889244L;
    private Integer cid;
    private String code;
    private String name;

    //关联关系：1 vs N
    private List<Student> studentList;

    public Clazz(){}

   public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
