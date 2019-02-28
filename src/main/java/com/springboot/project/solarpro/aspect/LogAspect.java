package com.springboot.project.solarpro.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.Pointcut;



public class LogAspect {
    private Logger logger = LoggerFactory.getLogger(LogAspect.class);
    public void logStart(){
        logger.info("logStart");
    }
    public void logEnd(){
        logger.info("logEnd");
    }
}
