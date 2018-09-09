package com.example.springaop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class LoginAspect {

    @Pointcut(value = "execution(* com.example.springaop.impl.*.login(..))")
    public void poincut(){
    }

    @Before(value = "poincut()")
    public void doBefore(){
        System.out.println("执行前");
    }

    @After(value = "poincut()")
    public void doAfter(){
        System.out.println("执行后");
    }

    @AfterThrowing(value = "poincut()")
    public void doThrowException(){
        System.out.println("抛出了异常：");
    }
}
