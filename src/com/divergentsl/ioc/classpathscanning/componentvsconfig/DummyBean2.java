package com.divergentsl.ioc.classpathscanning.componentvsconfig;

import javax.annotation.Resource;

public class DummyBean2 {
	
	@Resource
	private DummyBean dummyBean;

	public DummyBean getDummyBean() {
		return dummyBean;
	}

	public void setDummyBean(DummyBean dummyBean) {
		this.dummyBean = dummyBean;
	}

}
