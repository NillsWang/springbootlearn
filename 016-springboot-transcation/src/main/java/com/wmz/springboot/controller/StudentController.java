package com.wmz.springboot.controller;

import com.wmz.springboot.bean.Student;
import com.wmz.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
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

    @RequestMapping("/queryStudentById/{id}")
    @ResponseBody
    public Student queryStudentById(@PathVariable("id") Integer id){

        Student student = studentService.queryStudentById(id);
        return student;

    }

    @Transactional
    @RequestMapping("/updataStudentById/{id}/{name}/{age}")
    @ResponseBody
    public Object updataStudentById(@PathVariable("id") Integer id,
        @PathVariable("name") String name, @PathVariable("age") int age){
        Student student = new Student();
        student.setId(id);
        student.setAge(age);
        student.setName(name);

        int count = studentService.updataStudentById(student);
        return "修改条数"+ count;

    }

}


