package com.fc.Listener.test;

import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

import com.fc.bean.Test;
import com.fc.service.testService;

public class testContext{

	public void test(ApplicationContext applicationContext){
		testService service=applicationContext.getBean(testService.class);
		Test user=new Test();
		user.setUserid(UUID.randomUUID().toString().substring(0, 31).replaceAll("-",""));
		user.setUsername("test");
		service.insert(user);
	}
}
