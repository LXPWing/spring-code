package com.Li.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author : xingpeng
 * @date : 2021-09-23 16:26
 **/
@Configuration
@ComponentScan(value = "com.Li",excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)
})
public class SpringConfig {
}
