package com.wmz.springboot.controller;

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

    @RequestMapping("/say")
    @ResponseBody
    public String say(String message){
        return "hello" + message;
    }

    @RequestMapping("/mapvalue")
    @ResponseBody
    public Map<String, Object> mapvalue(){

        Map<String, Object> map = new HashMap<>();
        map.put("springboot", "springbootproj");
        return map;
    }

}


