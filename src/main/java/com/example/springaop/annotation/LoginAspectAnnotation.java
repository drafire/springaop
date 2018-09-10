package com.example.springaop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspectAnnotation {
    @Pointcut(value = "execution(* com.example.springaop.impl.*.login(..))")
    public void poincut(){
    }

    @Before(value = "poincut()")
    public void doBefore(){
        System.out.println("注解方式，执行前");
    }

    @After(value = "poincut()")
    public void doAfter(){
        System.out.println("注解方式，执行后");
    }
}
