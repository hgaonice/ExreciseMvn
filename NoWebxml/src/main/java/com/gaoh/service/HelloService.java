package com.gaoh.service;

import org.springframework.stereotype.Service;

/**
 * @Author: GH
 * @Date: 2019/5/14 22:41
 * @Version 1.0
 */
@Service
public class HelloService {

    public String hello(String partem) {
        return "hello " + partem;
    }
}
