package jspbotstrap;

import java.io.FileNotFoundException;

import org.junit.internal.runners.InitializationError;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

public class junitRunner extends JUnit4ClassRunner{
	static{
		try {
			Log4jConfigurer.initLogging("classpath:log4j.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("未找到");
		}
	}
	public junitRunner(Class<?> klass) throws InitializationError {
		super(klass);
		// TODO Auto-generated constructor stub
	}

}