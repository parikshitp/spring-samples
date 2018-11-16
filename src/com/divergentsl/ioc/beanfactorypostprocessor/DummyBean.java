package com.divergentsl.ioc.beanfactorypostprocessor;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;

public class DummyBean implements InitializingBean{

	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(DummyBean.class.getName());
	
	private int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// this will be printed before the call to the postprocessor
		log.debug("=============afterPropertiesSet==============");
	}

}
