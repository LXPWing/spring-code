package com.Li.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author : xingpeng
 * @date : 2021-09-11 15:58
 **/

/**
 * 执行顺序：前置通知 -> 目标方法 -> 返回通知 ->后置通知
 * try{
 *	前置通知
 *	目标方法
 *	返回通知
 * }catch(){
 * 	异常通知
 * }finally{
 *  后置通知
 * }
 */
@Configuration
@EnableAspectJAutoProxy //开启基于注解的AOP
public class AopConfig {
	
}
