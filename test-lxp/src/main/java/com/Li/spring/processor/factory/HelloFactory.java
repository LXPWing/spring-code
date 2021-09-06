package com.Li.spring.processor.factory;

import com.Li.spring.processor.entity.Hello;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author : xingpeng
 * @date : 2021-09-03 14:36
 **/
@Component
public class HelloFactory implements FactoryBean<Hello> {

	@Override
	public Hello getObject() throws Exception {
		return new Hello();
	}

	@Override
	public Class<?> getObjectType() {
		return Hello.class;
	}
}
