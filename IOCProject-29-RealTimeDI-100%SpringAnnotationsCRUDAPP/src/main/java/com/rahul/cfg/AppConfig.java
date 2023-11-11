package com.rahul.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.rahul")
@Import(value = PersistenceConfig.class)
public class AppConfig {

	static {
		System.out.println("AppConfig.enclosing_method()");
	}

	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}

}
