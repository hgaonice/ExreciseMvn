package com.gaoh.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Author: GH
 * @Date: 2019/5/13 23:56
 * @Version 1.0
 */
public class MyListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("contextInitialized....");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("contextDestroyed....");

    }
}
