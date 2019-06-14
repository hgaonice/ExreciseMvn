package com.gaoh.controller;

import com.gaoh.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: GH
 * @Date: 2019/5/14 22:40
 * @Version 1.0
 */
@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return helloService.hello("world");
    }

    @RequestMapping("/hellojsp")
    public String hellojsp() {
        return "hello";
    }

    @RequestMapping("/hong")
    public ModelAndView hong() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/success");
        return mv;
    }
}
