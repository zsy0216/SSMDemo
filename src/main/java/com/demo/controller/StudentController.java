package com.demo.controller;

import com.demo.entity.Student;
import com.demo.service.StudentService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @PackageName:com.demo.controller
 * @Date:2019/11/10 16:47
 * @Author: zsy
 */
@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/stu/page")
    public String pageInfoStudentByKeyword(
        @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
        @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
        @RequestParam(value = "keyword", defaultValue = "") String keyword,
        Model model){
            PageInfo<Student> studentPageInfo = studentService.findByKeyword(pageNum, pageSize, keyword);
            model.addAttribute("pageinfo", studentPageInfo);
            return "student";
        }
    }
