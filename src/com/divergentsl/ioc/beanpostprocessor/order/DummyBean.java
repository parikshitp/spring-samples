package com.divergentsl.ioc.beanpostprocessor.order;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;

public class DummyBean implements InitializingBean{

	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(DummyBean.class.getName());
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// this will be printed before the call to the postprocessor
		log.debug("=============afterPropertiesSet==============");
	}

}
