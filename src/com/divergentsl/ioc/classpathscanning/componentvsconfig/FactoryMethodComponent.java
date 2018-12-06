package com.divergentsl.ioc.classpathscanning.componentvsconfig;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FactoryMethodComponent {
	
	static Logger log = Logger.getLogger(FactoryMethodComponent.class.getName());
	
	@Bean
	public DummyBean firstInstance() {
		log.debug("====================== FactoryMethodComponent#firstInstance() ==============");
		
		return new DummyBean();
	}

	@Bean(name="factoryDummy2")
	protected DummyBean2 secondInstance() {
		log.debug("====================== FactoryMethodComponent#secondInstance() ==============");
		
		return new DummyBean2();
	}
	
}