package com.demo.service.impl;

import com.demo.entity.User;
import com.demo.mapper.UserDao;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @PackageName:com.demo.service.impl
 * @Date:2019/9/2 16:49
 * @Author: zsy
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
