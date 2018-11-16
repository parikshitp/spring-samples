package com.divergentsl.ioc.classpathscanning;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan(basePackages = "com.divergentsl.ioc.classpathscanning",
includeFilters = @Filter(type = FilterType.REGEX, pattern = ".*Bean"),
excludeFilters = @Filter(Repository.class))
public class AppConfiguration {
	
	static Logger log = Logger.getLogger(AppConfiguration.class.getName());
	
	/*@Bean
	public DummyBean firstDummy() {
		log.debug("======================first called==============");
		return new DummyBean(1);
	}

	*/
	
}