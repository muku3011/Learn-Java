package com.extra.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSpringBean {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring/SpringBeans.xml");

        FirstBean objA = (FirstBean) context.getBean("firstBean");

        objA.setMessage("I'm object A");
        objA.getMessage();

        FirstBean objB = (FirstBean) context.getBean("firstBean");
        objB.getMessage();
    }

}
