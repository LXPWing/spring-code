package com.Li.spring.config;

import com.Li.spring.processor.entity.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : xingpeng
 * @date : 2021-08-30 11:48
 **/
@ComponentScan("com.Li.spring")
@Configuration
public class MyConfig {
	public MyConfig(){
		System.out.println("MyConfig...");
	}

	@Bean
	public Cat cat(){
		return new Cat();
	}
}
