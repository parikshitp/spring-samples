package com.divergentsl.ioc.annotationconfig.primary;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(Application.class.getName());
	
	public static void main(String[] args) {
		
		if(log.isDebugEnabled())
			log.debug("Application Started!!!");
		
		//Loading the application context	
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		DummyBean dummy = context.getBean(DummyBean.class);
		
		log.debug("===================Dummy bean================ " + dummy.i);
	}
	
}
