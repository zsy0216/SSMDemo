package com.demo.service.impl;

import com.demo.entity.User;
import com.demo.mapper.UserMapper;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PackageName:com.demo.service.impl
 * @Date:2019/9/2 16:49
 * @Author: zsy
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void updateTransfer() {
        User user1 = userMapper.selectByPrimaryKey(1);
        User user2 = userMapper.selectByPrimaryKey(2);
        user1.setUserRemark(String.valueOf(Integer.parseInt(user1.getUserRemark())-500));
        userMapper.updateByPrimaryKey(user1);
        user1.setUserRemark(String.valueOf(Integer.parseInt(user2.getUserRemark())+500));
        userMapper.updateByPrimaryKey(user2);
    }
}
