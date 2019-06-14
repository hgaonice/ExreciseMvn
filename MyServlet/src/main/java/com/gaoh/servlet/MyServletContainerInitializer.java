package com.gaoh.servlet;

import com.gaoh.filter.MyFilter;
import com.gaoh.listener.MyListener;
import com.gaoh.service.MyInterface;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.util.EnumSet;
import java.util.Set;

/**
 * @Author: GH
 * @Date: 2019/5/12 22:57
 * @Version 1.0
 */
@HandlesTypes(value = {MyInterface.class})
public class MyServletContainerInitializer implements ServletContainerInitializer {

    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("MyServletContainerInitializer....");
        for (Class<?> cls : set) {
            System.out.println(cls);
        }
        //注册servlet
        ServletRegistration.Dynamic heelo = servletContext.addServlet("hello", MyServletDemo.class);
        heelo.addMapping("/helloDemo");

        //注册监听器
        servletContext.addListener(MyListener.class);

        //注册过滤器
        FilterRegistration.Dynamic myFilter = servletContext.addFilter("myFilter", MyFilter.class);
        //拦截所有请求
        myFilter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");
    }
}
