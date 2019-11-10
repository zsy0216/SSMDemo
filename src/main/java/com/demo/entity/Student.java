package com.demo.entity;

public class Student {
    private Integer id;

    private String stuName;

    private String stuSex;

    private Integer stuAge;

    private String stuPhone;

    private String stuRemark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone == null ? null : stuPhone.trim();
    }

    public String getStuRemark() {
        return stuRemark;
    }

    public void setStuRemark(String stuRemark) {
        this.stuRemark = stuRemark == null ? null : stuRemark.trim();
    }

    public Student() {
    }

    public Student(Integer id, String stuName, String stuSex, Integer stuAge, String stuPhone, String stuRemark) {
        this.id = id;
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuAge = stuAge;
        this.stuPhone = stuPhone;
        this.stuRemark = stuRemark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuAge=" + stuAge +
                ", stuPhone='" + stuPhone + '\'' +
                ", stuRemark='" + stuRemark + '\'' +
                '}';
    }
}