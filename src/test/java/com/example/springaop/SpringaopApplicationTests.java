package com.example.springaop;

import com.example.springaop.impl.Shopping;
import com.example.springaop.impl.Work;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringaopApplicationTests {

	@Test
	public void contextLoads() {
	}
}
