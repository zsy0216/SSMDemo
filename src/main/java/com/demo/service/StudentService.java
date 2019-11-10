package com.demo.service;

import com.demo.entity.Student;
import com.github.pagehelper.PageInfo;

/**
 * @PackageName:com.demo.service
 * @Date:2019/11/10 16:17
 * @Author: zsy
 */
public interface StudentService {

    void updateAge();

    PageInfo<Student> findByKeyword(Integer pageNum, Integer pageSize, String keyword);
}
