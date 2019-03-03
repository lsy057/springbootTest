package com.springboot.project.solarpro.aspect;


import org.springframework.aop.framework.Advised;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("bean.xml");
        Div div=(Div) applicationContext.getBean("div");
        LogAspect logAspect =(LogAspect) applicationContext.getBean("logAspect");
        int a= div.div(20,5);
        System.out.println("a="+ a);
        if(div instanceof Advised){
            System.out.println("div is advised");
        }

    }
}
