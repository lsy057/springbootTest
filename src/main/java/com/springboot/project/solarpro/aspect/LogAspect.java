package com.springboot.project.solarpro.aspect;



import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;

public class LogAspect {
    private Logger logger = LoggerFactory.getLogger(LogAspect.class);
    public void logStart(JoinPoint joinPoint){
        logger.info("logStart[" + joinPoint.getSignature().getName() + "]运行的参数列表为：" + Arrays.asList(joinPoint.getArgs()));
    }
    public void logEnd(JoinPoint joinPoint){
        logger.info("logEnd[" + joinPoint.getSignature().getName() + "]运行结束的参数列表为：" + Arrays.asList(joinPoint.getArgs()));
    }
    public void logReturn(Object result){
        logger.info("logReturn" + "运行正常的返回值：" + result);
    }
    public void logException(Exception exception){
        logger.info("logException" + "运行异常的的异常信息是：" + exception);
    }
}
