package com.example.springbootexrecise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: GH
 * @Date: 2019/3/21 12:48
 * @Version 1.0
 */
@Controller
public class TestController001 {

    @RequestMapping("/demo")
    public String test() {
        return "/test";
    }

}
