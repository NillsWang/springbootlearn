package com.nilswang.springboot.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangminze
 * @create 2020-08-19-18:32
 */
@Controller
public class StudentController {

    @Reference(interfaceClass = StudentService.class, version = "1.0.0", check = false)
    StudentService studentService;

    @ResponseBody
    @RequestMapping("/student/count")
    public Object studentCount(){
        int count = studentService.queryAllStudentCount();
        return "总人数为"+count;
    }

}
