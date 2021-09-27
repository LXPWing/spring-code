package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : xingpeng
 * @date : 2021-09-27 21:00
 **/
@RestController
@RequestMapping("/")
public class HelloWorld {

	public HelloWorld(){
		System.out.println("初始化HelloWorld组件");
	}

	@RequestMapping("world")
	public String sayHello(){
		return "Hello";
	}

}
