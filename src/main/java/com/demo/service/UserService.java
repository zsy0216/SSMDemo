package com.demo.service;

import com.demo.entity.User;

import java.util.List;

/**
 * @PackageName:com.demo.service
 * @Date:2019/9/2 16:49
 * @Author: zsy
 */
public interface UserService {
    List<User> findAll();
}
