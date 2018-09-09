package com.example.springaop.annotation;

import com.example.springaop.impl.Shopping;
import com.example.springaop.impl.Work;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@RunWith(JUnit4.class)
@SpringBootTest
public class LoginAspectTest {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:context.xml");
        Work work=(Work)context.getBean("work");
        Shopping shopping=(Shopping)context.getBean("shopping");

        //<!--<aop:aspectj-autoproxy/>--> 如果xml中开启了自动代理，则会执行两次。因为上面已经手动获取过bean了，这个也是代理的bean
        work.login("tom");
        System.out.println("------------------------------------------------------");
        shopping.login("jaky",10);
    }
}