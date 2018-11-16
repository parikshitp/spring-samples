package com.divergentsl.ioc.beanpostprocessor;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {
	
	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(InstantiationTracingBeanPostProcessor.class.getName());
	
	
	// simply return the instantiated bean as-is
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean; // we could potentially return any object reference here...
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		if(log.isInfoEnabled())
			log.info("Bean '" + beanName + "' created : " + bean.toString());
		
		return bean;
	}
}
