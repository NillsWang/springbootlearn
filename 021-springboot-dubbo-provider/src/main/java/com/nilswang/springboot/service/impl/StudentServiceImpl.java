package com.nilswang.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.nilswang.springboot.service.StudentService;
import org.springframework.stereotype.Component;

/**
 * @author wangminze
 * @create 2020-08-19-18:38
 */

@Component
@Service(interfaceClass = StudentService.class, version = "1.0.0")
public class StudentServiceImpl implements StudentService {
    @Override
    public int queryAllStudentCount() {
        return 100;
    }
}



