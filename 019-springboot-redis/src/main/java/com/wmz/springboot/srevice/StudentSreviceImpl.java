package com.wmz.springboot.srevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author wangminze
 * @create 2020-05-08-19:37
 */

@Service
public class StudentSreviceImpl implements  StudentService{

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Override
    public void put(String key, String value) {
        redisTemplate.opsForValue().set(key,value);
    }

    @Override
    public String get(String count) {
        return (String)redisTemplate.opsForValue().get(count);
    }
}
