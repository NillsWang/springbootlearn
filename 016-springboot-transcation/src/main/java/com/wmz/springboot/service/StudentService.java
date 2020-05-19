package com.wmz.springboot.service;

import com.wmz.springboot.bean.Student;

/**
 * @author wangminze
 * @create 2020-05-08-14:48
 */
public interface StudentService {

    Student queryStudentById(Integer id);

    int updataStudentById(Student student);
}
