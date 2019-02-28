package com.springboot.project.solarpro.aspect;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("bean.xml");
        Div div=(Div) applicationContext.getBean("div");
        LogAspect logAspect =(LogAspect) applicationContext.getBean("logAspect");
        int a= div.div(2,3);
        System.out.println("a="+ a);


    }
}
