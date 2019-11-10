package com.demo.service.impl;

import com.demo.entity.Student;
import com.demo.mapper.StudentMapper;
import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PackageName:com.demo.service.impl
 * @Date:2019/11/10 16:17
 * @Author: zsy
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public void updateAge() {
        Student student = studentMapper.selectByPrimaryKey(1);
        Student student1 = studentMapper.selectByPrimaryKey(2);

        student.setStuAge(student.getStuAge() + 5);
        studentMapper.updateByPrimaryKey(student);

        student1.setStuAge(student1.getStuAge() - 5);
        studentMapper.updateByPrimaryKey(student1);

    }
}
