package com.demo;

import com.demo.entity.Student;
import com.demo.mapper.StudentMapper;
import com.demo.service.StudentService;
import com.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @PackageName:com.demo
 * @Date:2019/11/10 16:01
 * @Author: zsy
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext.xml")
public class testTx {

    @Autowired
    UserService userService;

    @Autowired
    StudentService studentService;

    @Autowired
    StudentMapper studentMapper;

    @Test
    public void testTx(){
        userService.updateTransfer();
    }

    @Test
    public void test2(){
        studentService.updateAge();
    }

    @Test
    public void createPageStudentData(){
        Student student;
        for (int i = 0; i < 499; i++){
            student = new Student(null, "test"+i, "1", i, "123456", null);
            studentMapper.insert(student);
        }
    }

    @Test
    public void testPageInfo(){
        System.out.println(studentService.findByKeyword(1,10,"").getList());
    }
}
