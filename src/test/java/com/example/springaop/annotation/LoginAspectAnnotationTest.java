package com.example.springaop.annotation;

import com.example.springaop.SpringaopApplication;
import com.example.springaop.impl.Shopping;
import com.example.springaop.impl.Work;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@RunWith(JUnit4.class)
@SpringBootTest
//@ContextConfiguration(classes = SpringaopApplication.class)
public class LoginAspectAnnotationTest {

    @Autowired
    private Work work;

    @Test
    public void test(){
        work.login("开始的电脑");
    }
}
