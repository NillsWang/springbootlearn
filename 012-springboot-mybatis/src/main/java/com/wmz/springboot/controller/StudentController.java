package com.wmz.springboot.controller;

import com.wmz.springboot.bean.Student;
import com.wmz.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangminze
 * @create 2020-05-07-20:55
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/student/{id}")
    @ResponseBody
    public Object say(@PathVariable("id") Integer id){

        Student student = studentService.queryStudentById(id);
        return student;

    }

}


