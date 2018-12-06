package com.divergentsl.ioc.classpathscanning.componentvsconfig;

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
		
		//TODO (1) =========================Programmatically registration =====================================
		/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfiguration.class, FactoryMethodComponent.class);
		context.refresh();*/
		//	==============================================================
		
		//TODO (2)=========================Programmatically component scan=====================================
		/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.divergentsl.ioc.classpathscanning.componentvsconfig");
		context.refresh();*/
		//	==============================================================
		
				
		//TODO (3) Loading the application context	
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		
		DummyBean2 configDummy2 = (DummyBean2)context.getBean("configDummy2");
		
		log.debug("===================Config Dummy bean================ " + configDummy2.getDummyBean());
		
		DummyBean2 factoryDummy2 = (DummyBean2)context.getBean("factoryDummy2");
		
		log.debug("===================Factory Dummy bean================ " + factoryDummy2.getDummyBean());
	}
	
}
