package com.Li.spring.processor.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : xingpeng
 * @date : 2021-09-09 14:54
 **/
@Component
public class A {
	@Autowired
	private B b;

	public A() {
		System.out.println("into A");
	}
}
