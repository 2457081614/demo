package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author : yangliu@tiduyun.com
 */
@Aspect
@Component
public class LoggerAspect {

    @Pointcut("@annotation(com.example.demo.aop.DemoLogger)")
    public void pointCut() {

    }

    @Before("pointCut()")
    public Object before() {
        System.out.println("aop start");
        return null;
    }


    @After("pointCut()")
    public Object after() {
        System.out.println("aop after");
        return null;
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint point) {
        System.out.println("aop around");
        return null;
    }
}
