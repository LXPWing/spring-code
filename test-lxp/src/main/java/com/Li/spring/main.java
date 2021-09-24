package com.Li.spring;

import com.Li.spring.config.MyConfig;
import com.Li.spring.processor.aop.HelloService;
import com.Li.spring.processor.entity.Cat;
import com.Li.spring.processor.entity.Hello;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : xingpeng
 * @date : 2021-08-26 14:46
 **/
@ComponentScan("com.Li.spring")
public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Cat cat = (Cat)classPathXmlApplicationContext.getBean("cat");
        System.out.println(cat.getAge());

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
//		Hello bean = annotationConfigApplicationContext.getBean(Hello.class);
//		System.out.println(bean);

		//aop
		HelloService hello = annotationConfigApplicationContext.getBean(HelloService.class);
		hello.sayHello("lxp");


	}
}
