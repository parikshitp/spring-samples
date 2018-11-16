package com.divergentsl.ioc.beanpostprocessor.prog;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(Application.class.getName());

	public static void main(String[] args) {

		if (log.isDebugEnabled())
			log.debug("Application Started!!!");

		// Loading the application context
		ApplicationContext context = new ClassPathXmlApplicationContext("com/divergentsl/ioc/beanpostprocessor/prog/applicationContext.xml");
		
		//get the configurable bean factory instance
		ConfigurableBeanFactory beanFactory=((AbstractApplicationContext)context).getBeanFactory();
		beanFactory.addBeanPostProcessor(new InstantiationTracingBeanPostProcessor());
		
		
		//TODO example of adding dynamic bean definitions to the application context
		/*BeanDefinitionRegistry beanDefinitionRegistry = (BeanDefinitionRegistry) beanFactory;
	    BeanDefinition dynamicBean = BeanDefinitionBuilder
	        .rootBeanDefinition(DummyBean.class)
	        .addConstructorArgValue("dynamically created bean")
	        .getBeanDefinition();

	    beanDefinitionRegistry.registerBeanDefinition("dynamicBean", dynamicBean);*/
	}
}
