package com.fc.Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.hamcrest.core.IsInstanceOf;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.fc.Listener.test.testContext;
//@Component("BeanDefineConfigue")
public class baseListener implements ApplicationListener<ContextRefreshedEvent>{

	private testContext context;
	public baseListener() {
		context=new testContext();
	}
	/*@Override
	public void contextInitialized(ServletContextEvent sce) {
		context.test(WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext()));
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}*/
//	@Override
//	public void onApplicationEvent(ApplicationEvent event) {
//		if(event instanceof ContextRefreshedEvent){
////			context.test(WebApplicationContextUtils.getWebApplicationContext(event.getServletContext()));
//			context.test(((ContextRefreshedEvent) event).getApplicationContext());
//		}
//		
//	}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if(event instanceof ContextRefreshedEvent){
//			context.test(WebApplicationContextUtils.getWebApplicationContext(event.getServletContext()));
			context.test(((ContextRefreshedEvent) event).getApplicationContext());
	}
	}
}
