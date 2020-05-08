package com.wmz.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangminze
 * @create 2020-05-07-20:55
 */
@Controller
public class IndexController {

    //取出核心配置文件中自定义的值
    @Value("${school.name}")
    private String schoolName;

    @Value("${website}")
    private String website;

    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        return "hello" + schoolName + website;
    }


}


