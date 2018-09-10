package com.example.springaop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspect {

    @Pointcut(value = "execution(* com.example.springaop.impl.Shopping.login(..))")    //如果这里由impl.*.login(..) 变成了impl.Shopping.login，则不会再匹配Work
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
