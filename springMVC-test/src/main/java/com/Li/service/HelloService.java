package com.Li.service;

import org.springframework.stereotype.Service;

/**
 * @author : xingpeng
 * @date : 2021-09-28 15:24
 **/
@Service
public class HelloService {

	public HelloService(){
		System.out.println("HelloService创建对象");
	}

	public String say(String name){
		return "hello"+name;
	}
	 
}
