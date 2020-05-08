package com.wmz.springboot.controller;

import com.wmz.springboot.bean.School;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private School school;

    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        return "school.name=" + school.getName() + "school.website" + school.getWebsite();
    }

}


