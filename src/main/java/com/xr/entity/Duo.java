package com.xr.entity;

import java.io.Serializable;

public class Duo implements Serializable {

    private static final long serialVersionUID = 3572426142941380213L;
    private Integer studentId;    //学生ID
    private Integer classId;    //班级ID
    private String studentName;    //学生姓名
    private Integer studentAge;
    private String className;
    private String classAdminName;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }



    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassAdminName() {
        return classAdminName;
    }

    public void setClassAdminName(String classAdminName) {
        this.classAdminName = classAdminName;
    }

    @Override
    public String toString() {
        return "Duo{" +
                "studentId=" + studentId +
                ", classId=" + classId +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", className='" + className + '\'' +
                ", classAdminName='" + classAdminName + '\'' +
                '}';
    }
}
