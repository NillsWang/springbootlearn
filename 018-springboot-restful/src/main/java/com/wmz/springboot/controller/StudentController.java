package com.wmz.springboot.controller;

import com.wmz.springboot.bean.Student;
import org.springframework.web.bind.annotation.*;

/**
 * @author wangminze
 * @create 2020-05-07-20:55
 */
@RestController
// 相当于控制层类上加@Controller + @ResponseBody
// 意味着当前控制层类中所有方法返回json对象
public class StudentController {

    @RequestMapping("/student/{id}/{age}")
    public Student queryStudent(@PathVariable("id") Integer id,
            @PathVariable("age") int age){

        Student student = new Student();
        student.setName("ss");
        student.setAge(age);
        student.setId(id);

        return student;

    }
    @RequestMapping("/student/{id}/{status}")
    public Student queryStudentTwo(@PathVariable("id") Integer id,
            @PathVariable("status") int age){

        Student student = new Student();
        student.setName("ss");
        student.setAge(age);
        student.setId(id);

        return student;

    }

    //以上代码会出现请求路径混淆的错误
    //通常在RESTful中的代码中请求方法会按增删改查的请求方式来区分
    //相同增删改查的请求也会混淆，通过修改参数位置来避免

    //RESTful原则 增post 删delete 改put 查get
    // 请求路径尽量不要出现动词
    // 分页、排序等操作，不需要使用斜杠传递参数

}


