package com.wmz.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangminze
 * @create 2020-05-07-20:48
 */
@Controller
public class IndexController {

    @RequestMapping("/springboot/say")
    @ResponseBody
    public String say(){
        return "Hello SpringBoot";
    }

}
