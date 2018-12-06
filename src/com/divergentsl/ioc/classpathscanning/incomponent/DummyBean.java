package com.divergentsl.ioc.classpathscanning.incomponent;

import org.springframework.stereotype.Component;

@Component
public class DummyBean {
	private String name;
	private int i;
	
	public DummyBean() {
		
	}
	
	public DummyBean(String name, int i) {
		this.name = name;
		this.i = i;
	}
	
	public DummyBean(String name) {
		this.name = name;
	}
		
}
