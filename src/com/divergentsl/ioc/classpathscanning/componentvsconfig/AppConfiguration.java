package com.divergentsl.ioc.classpathscanning.componentvsconfig;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.divergentsl.ioc.classpathscanning.componentvsconfig")
public class AppConfiguration {
	
	static Logger log = Logger.getLogger(AppConfiguration.class.getName());
	
	@Bean
	public DummyBean firstDummy() {
		log.debug("====================== AppConfiguration#firstDummy() ==============");
		return new DummyBean();
	}

	@Bean(name="configDummy2") 
	public DummyBean2 secondDummy(){
		log.debug("====================== AppConfiguration#secondDummy() ==============");
		return new DummyBean2();
	}
	
}