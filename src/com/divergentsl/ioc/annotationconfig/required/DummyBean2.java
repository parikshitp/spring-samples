package com.divergentsl.ioc.annotationconfig.required;

import org.springframework.beans.factory.annotation.Required;

public class DummyBean2 {
	
	
	private DummyBean dummyBean;

	public DummyBean getDummyBean() {
		return dummyBean;
	}

	@Required
	public void setDummyBean(DummyBean dummyBean) {
		this.dummyBean = dummyBean;
	}
	

}
