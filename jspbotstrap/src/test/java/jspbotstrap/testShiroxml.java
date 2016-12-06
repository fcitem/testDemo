package jspbotstrap;

import java.io.FileNotFoundException;

import org.apache.log4j.lf5.util.Resource;
import org.junit.Test;
import org.junit.internal.runners.InitializationError;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.Log4jConfigurer;

import com.alibaba.druid.pool.DruidDataSource;
import com.fc.base.jsonConnect;
import com.fc.base.users;

@RunWith(junitRunner.class)
public class testShiroxml {

	@Test
	public void testshiro(){
//		BeanFactory factory=new ClassPathXmlApplicationContext("classpath:spring-mvc.xml");
//		DruidDataSource datasource= (DruidDataSource) factory.getBean("dataSource");
//		System.out.println("hello");
		jsonConnect json=new jsonConnect("/jspbotstrap/loginValidate");
		users user=new users();
		user.setUsername("fc");
		user.setPassword("123");
		json.send(user,users.class);
	}
	@Test
	public void testSend(){
		jsonConnect json=new jsonConnect("/jspbotstrap/loginValidate");
		json.sendtest("username=fc&password=132456");
	}
}
