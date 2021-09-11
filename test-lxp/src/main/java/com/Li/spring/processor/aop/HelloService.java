package com.Li.spring.processor.aop;

import org.springframework.stereotype.Component;

/**
 * @author : xingpeng
 * @date : 2021-09-11 16:00
 **/
@Component
public class HelloService {
	public HelloService(){
		System.out.println("HelloService");
	}

	public String sayHello(String name){
		String result="你好："+name;
		System.out.println(result);
		int len=name.length();
		return result+"---"+len;
	}
}
