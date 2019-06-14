package com.gaoh.annotation.test;

import com.gaoh.annotation.configuration.ConfigurationComponentScan;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: GH
 * @Date: 2019/4/2 22:50
 * @Version 1.0
 */
public class TestComponentScan {

    @Test
    public void test() {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(ConfigurationComponentScan.class);

        String[] names = configApplicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
