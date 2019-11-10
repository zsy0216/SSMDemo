package com.demo.controller;

import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @PackageName:com.demo.controller
 * @Date:2019/9/2 16:50
 * @Author: zsy
 */
@Controller
@ResponseBody
public class UserController {

    @Autowired
    UserService userService;


}
