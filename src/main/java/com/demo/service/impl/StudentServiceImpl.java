package com.demo.service.impl;

import com.demo.entity.Student;
import com.demo.entity.StudentExample;
import com.demo.mapper.StudentMapper;
import com.demo.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public PageInfo<Student> findByKeyword(Integer pageNum, Integer pageSize, String keyword) {
        // 开启分页
        PageHelper.startPage(pageNum, pageSize);

        // 根据关键字查询，为空表示查询所有
        List<Student> studentList = studentMapper.selectByKeyword(keyword);

        // 封装list到PageInfo对象中进行自动分页
        PageInfo<Student> studentPageInfo = new PageInfo<>(studentList);

        return studentPageInfo;
    }
}
