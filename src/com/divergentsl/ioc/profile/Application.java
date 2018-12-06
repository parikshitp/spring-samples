package com.divergentsl.ioc.profile;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {

	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(Application.class.getName());
	
	public static void main(String[] args) {
		
		if(log.isDebugEnabled())
			log.debug("Application Started!!!");
		
		//Loading the application context	
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles("dev");
		ctx.register(StandaloneDataConfig.class, JndiDataConfig.class);
		ctx.refresh();
		
		DataSource dataSource = ctx.getBean(DataSource.class);
		
		log.debug("===================dataSource================ " + dataSource);
	}
	
}
