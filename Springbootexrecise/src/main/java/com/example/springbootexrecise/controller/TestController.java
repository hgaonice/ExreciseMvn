package com.example.springbootexrecise.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: GH
 * @Date: 2019/3/21 12:48
 * @Version 1.0
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "hello world!";
    }

}
