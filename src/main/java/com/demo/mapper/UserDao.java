package com.demo.mapper;

import com.demo.entity.User;

import java.util.List;

/**
 * @PackageName:com.demo.mapper
 * @Date:2019/9/2 16:48
 * @Author: zsy
 */

public interface UserDao {
    List<User> findAll();
}
