package com.trial.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.trial.bean.User;

public class JdbcTest {
	
	/*@Before
	public void before(){
		
	}*/
	@Test
	public void testselect(){
		//User user = null;
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		User user = (User) ctx.getBean("user");
		user.method();
	}
	


}
