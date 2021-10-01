package com.Li.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author : xingpeng
 * @date : 2021-09-28 15:15
 **/
@Configuration
@ComponentScan(value = "com.Li",includeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)
},useDefaultFilters = false) 
public class SpringMVCConfig {
}
