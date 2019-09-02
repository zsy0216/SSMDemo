package com.demo.entity;

/**
 * @PackageName:com.demo.entity
 * @Date:2019/9/2 16:47
 * @Author: zsy
 */
public class User {

    private Integer id;
    private String name;
    private String password;
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
