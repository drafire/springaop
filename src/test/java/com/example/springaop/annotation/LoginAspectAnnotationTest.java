package com.example.springaop.annotation;

import com.example.springaop.impl.Work;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginAspectAnnotationTest {

    //有时候这里注入不了，是因为依赖的关系
    @Autowired
    private Work work;

    @Test
    public void test(){
        work.login("张三");
    }
}
