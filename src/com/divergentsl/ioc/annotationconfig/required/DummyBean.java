package com.divergentsl.ioc.annotationconfig.required;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;

public class DummyBean {

	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(DummyBean.class.getName());
	
	private int value;
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
