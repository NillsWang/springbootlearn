package com.wmz.springboot.controller;

import com.wmz.springboot.srevice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangminze
 * @create 2020-05-08-19:32
 */
@Controller
public class RedisController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/put")
    @ResponseBody
    public Object put(String key, String value){

        studentService.put(key, value);
        return "";
    }

    @RequestMapping("/get")
    @ResponseBody
    public String get(){

        return studentService.get("count");
    }

}
