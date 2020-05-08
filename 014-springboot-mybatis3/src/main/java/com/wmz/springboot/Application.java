package com.wmz.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.wmz.springboot.mapper") //开启扫描mapper接口的包以及子包
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
