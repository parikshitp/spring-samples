package com.divergentsl.ioc.annotationconfig.resource;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {

	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(Application.class.getName());
	
	public static void main(String[] args) {
		
		if(log.isDebugEnabled())
			log.debug("Application Started!!!");
		
		//Loading the application context	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/divergentsl/ioc/annotationconfig/resource/applicationContext.xml");
		
		DummyBean2 dummy = context.getBean(DummyBean2.class);
		
		log.debug("=============injected bean==========" + dummy.getDummyBean());
	}
	
}
