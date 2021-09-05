package com.ie.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ie.dao.TestDao;

public class TestTest {

	@Test
	public void sayHello() {
		ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
		TestDao tt = (TestDao) appCon.getBean("test");
		tt.sayHello();
	}

}
