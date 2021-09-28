package com.Li.controller;

import com.Li.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : xingpeng
 * @date : 2021-09-27 21:00
 **/
@RestController
public class HelloWorld {

	@Autowired
	HelloService helloService;

	public HelloWorld(){
		System.out.println("初始化HelloWorld组件");
	}

	@RequestMapping("/world")
	public String sayHello(){
		return helloService.say("MVC");
	}

}
