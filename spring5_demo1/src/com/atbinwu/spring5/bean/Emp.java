package com.atbinwu.spring5.bean;

public class Emp {
    private String ename;
    private String gender;

    public Dept getDept() {
        return dept;
    }

    //员工属于某一个部门，使用对象表示
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
