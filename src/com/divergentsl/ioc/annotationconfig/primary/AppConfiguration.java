package com.divergentsl.ioc.annotationconfig.primary;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.divergentsl.ioc.annotationconfig.autowired.DummyBean2;

@Configuration
public class AppConfiguration {
	
	static Logger log = Logger.getLogger(AppConfiguration.class.getName());
	
	@Bean
	public DummyBean firstDummy() {
		log.debug("======================first called==============");
		return new DummyBean(1);
	}

	@Bean
	@Primary
	public DummyBean secondDummy() {
		log.debug("======================second called==============");
		return new DummyBean(2);
	}
	
}