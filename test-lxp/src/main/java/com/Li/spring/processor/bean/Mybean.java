package com.Li.spring.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;

/**
 * @author : xingpeng
 * @date : 2021-08-30 17:38
 **/
public class Mybean implements SmartInstantiationAwareBeanPostProcessor {

	@Override
	public Class<?> predictBeanType(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("调用SmartInstantiationAwareBeanPostProcessor的predictBeanType方法");
		return null;
	}
}
