package com.divergentsl.ioc.annotationconfig.autowired;

import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class DummyBean2 {
	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(DummyBean2.class.getName());
	
	
	@Autowired(required=false)  // By default, the autowiring fails whenever zero candidate beans are available
	private DummyBean dummyBean;

	@Autowired  //TODO no need to have setter method, also multiple beans can be autowired at once
	private Set<DummyBean> dummyBeans;
	
	public Set<DummyBean> getDummyBeans() {
		return dummyBeans;
	}

	public DummyBean getDummyBean() {
		return dummyBean;
	}

	public void setDummyBean(DummyBean dummyBean) {
		this.dummyBean = dummyBean;
	}
	

	@Autowired  // can be applied to any method 
	public void collectDummyBeans(DummyBean dummyBean, DummyBean3 dummyBean3) {
		
		log.debug("========dummy beans set=======" + dummyBean.hashCode() + "," + dummyBean3.hashCode());
	}
	
	
}
