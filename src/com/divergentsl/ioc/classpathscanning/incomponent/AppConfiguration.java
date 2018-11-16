package com.divergentsl.ioc.classpathscanning.incomponent;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan(basePackages = "com.divergentsl.ioc.classpathscanning.incomponent",
includeFilters = @Filter(type = FilterType.REGEX, pattern = ".*Bean"),
excludeFilters = @Filter(Repository.class))
public class AppConfiguration {
	
		
}