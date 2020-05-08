package com.wmz.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wangminze
 * @create 2020-05-07-20:55
 */
@Controller
public class IndexController {

    @RequestMapping("/say")
    public String say(Model model){

        model.addAttribute("user","user");
        return "say";

    }

    @RequestMapping("/say1")
    public ModelAndView say1(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user","user");
        modelAndView.setViewName("say");
        return modelAndView;
    }

    @RequestMapping("/say2")
    @ResponseBody
    public String say2(){
        return "mv";
    }

}


