package com.Li.spring.processor.entity;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author : xingpeng
 * @date : 2021-08-26 14:49
 **/
@Component
public class Cat implements ApplicationContextAware {
    private String name;
    private Integer age;
    private ApplicationContextAware applicationContextAware;
    public Cat() {
        System.out.println("这里是Cat");
    }


//    public Cat(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContextAware=applicationContextAware;
    }
}
