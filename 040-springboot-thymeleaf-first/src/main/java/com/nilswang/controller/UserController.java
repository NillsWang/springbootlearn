package com.nilswang.controller;

import com.nilswang.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangminze
 * @create 2020-08-21-7:11
 */
@Controller
public class UserController {

    @RequestMapping("/message")
    public String message(Model model){
        Model message = model.addAttribute("message", "springboot集成thymeleaf");
        return "message";
    }

    @RequestMapping("/userDetail")
    public String userDetail(Model model){
        User user = new User(1001,"张三");
        model.addAttribute("user", user);
        return "userDetail";
    }
    @RequestMapping("/url")
    public String url(Model model,User user){
        User user1 = new User();
        user1.setId(user.getId());
        user1.setUserName(user.getUserName());
        model.addAttribute("user", user1);
        return "userDetail";
    }
    @RequestMapping("/each/list")
    public String list(Model model){
        List<User> users = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            User user = new User();
            user.setId(i);
            user.setUserName("user"+i);
            users.add(user);
        }
        model.addAttribute("users", users);
        return "userList";
    }
    @RequestMapping("/each/map")
    public String map(Model model){
        Map<Integer,User> users = new HashMap<>();
        for (int i = 0; i <10 ; i++) {
            User user = new User();
            user.setId(i);
            user.setUserName("user"+i);
            users.put(i,user);
        }
        model.addAttribute("users", users);
        return "userMap";
    }
    @RequestMapping("/each/array")
    public String array(Model model){
        User[] users = new User[10];
        for (int i = 0; i <10 ; i++) {
            User user = new User();
            user.setId(i);
            user.setUserName("user"+i);
            users[i] = user;
        }
        model.addAttribute("users", users);
        return "userArray";
    }

}
