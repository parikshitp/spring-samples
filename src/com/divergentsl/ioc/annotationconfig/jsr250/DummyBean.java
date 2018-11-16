package com.divergentsl.ioc.annotationconfig.jsr250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.log4j.Logger;

public class DummyBean {

	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(DummyBean.class.getName());
	
	@PostConstruct
	public void start(){
		log.debug("=============start called================");
	}
	
	@PreDestroy
	public void stop(){
		log.debug("=============stop called================");
	}
	
}
