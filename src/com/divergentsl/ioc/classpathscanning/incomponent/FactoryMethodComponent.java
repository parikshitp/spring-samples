package com.divergentsl.ioc.classpathscanning.incomponent;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FactoryMethodComponent {
	private static int i;

	@Bean
	@Qualifier("public")
	public DummyBean publicInstance() {
		return new DummyBean("publicInstance");
	}

	// use of a custom qualifier and autowiring of method parameters
	@Bean
	protected DummyBean protectedInstance(@Qualifier("public") DummyBean spouse) {
		DummyBean tb = new DummyBean("protectedInstance", 1);
		return tb;
	}

	@Bean
	private DummyBean privateInstance() {
		return new DummyBean("privateInstance", i++);
	}
}