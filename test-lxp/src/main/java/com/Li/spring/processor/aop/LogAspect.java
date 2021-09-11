package com.Li.spring.processor.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author : xingpeng
 * @date : 2021-09-11 16:03
 **/
@Component
@Aspect
public class LogAspect {
	public LogAspect(){
		System.out.println("LogAspect");
	}

	@Before(value = "execution(* com.Li.spring.processor.aop.HelloService.sayHello(..))")
	public void logStart(JoinPoint joinPoint){
		String name=joinPoint.getSignature().getName();
		System.out.println("logStart()==>"+name+"...[args:");
	}
}
