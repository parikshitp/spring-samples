package com.divergentsl.ioc.annotationconfig.required;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class DummyBean2 {
	
	
	private DummyBean dummyBean;

	public DummyBean getDummyBean() {
		return dummyBean;
	}

	@Required
	//@Autowired //TODO remove this comment to avoid exception
	public void setDummyBean(DummyBean dummyBean) {
		this.dummyBean = dummyBean;
	}
	

}
