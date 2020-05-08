package com.wmz.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//springboot项目启动入口类
@SpringBootApplication //开启springboot配置
public class Application {

    //springboot代码必须放在Application类所在的同级目录下或下级目录
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
