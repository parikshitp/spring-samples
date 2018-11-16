package com.divergentsl.ioc.annotationconfig.resource;

import javax.annotation.Resource;

public class DummyBean2 {
	
	
	//of not found by name it will fall back by type. 
	//if no name specified in the annotation then name is derived from property name
	//@Resource(name="myDummyBean") 
	private DummyBean dummyBean;

	public DummyBean getDummyBean() {
		return dummyBean;
	}

	@Resource(name="myDummyBean")  
	//of not found by name it will fall back by type. 
	//if no name specified in the annotation then name is derived from setter method  
	public void setDummyBean(DummyBean dummyBean) {
		this.dummyBean = dummyBean;
	}
	

}
