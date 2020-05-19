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

    @RequestMapping("/student")
    public Student queryStudent(){

        Student student = new Student();
        student.setId(1);
        student.setName("张三");
        student.setAge(25);
        return student;

    }

    //该方法请求方式支持get和post请求
    @RequestMapping(value = "/studentDetail",
            method = {RequestMethod.GET,RequestMethod.POST})
    public Student studentDetail(Integer id){

        Student student = new Student();
        student.setId(id);
        student.setName("张三");
        student.setAge(25);
        return student;

    }

    //该方法请求方式支持get
    //@RequestMapping(value = "/studentDetailTwo",
    //        method = RequestMethod.GET)
    @GetMapping("/studentDetailTwo") //相当于上面的，只支持get请求
    //该注解通常在查询数据时使用
    public Student studentDetailTwo(Integer id){

        Student student = new Student();
        student.setId(id);
        student.setName("张三");
        student.setAge(25);
        return student;

    }

    //@RequestMapping(value = "/insertStudent",
    //        method = RequestMethod.POST)
    @PostMapping("/studentDetailTwo") //相当于上面的，只支持get请求
    //该注解通常在插入数据时使用
    public Student insertStudent(Student student){

        return student;

    }

    //@RequestMapping(value = "/insertStudent",
    //        method = RequestMethod.DELETE)
    @DeleteMapping("/deleteStudent") //相当于上面的，只支持get请求
    //该注解通常在删除数据时使用
    public Student deleteStudent(Integer id){

        Student student = new Student();
        student.setId(id);
        student.setName("张三");
        student.setAge(25);
        return student;

    }

    //@RequestMapping(value = "/updateStudent",
    //        method = RequestMethod.PUT)
    @PutMapping("/deleteStudent") //相当于上面的，只支持get请求
    //该注解通常在修改数据时使用
    public Student updateStudent(Student student){

        return student;

    }

}


