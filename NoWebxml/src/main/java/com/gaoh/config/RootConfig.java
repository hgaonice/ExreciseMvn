package com.gaoh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @Author: GH
 * @Date: 2019/5/14 22:20
 * @Version 1.0
 */
@ComponentScan(value = "com.gaoh",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class)
},useDefaultFilters = false)
@Configuration
public class RootConfig {
}
