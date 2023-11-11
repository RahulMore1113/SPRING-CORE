package com.rahul.cfg;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.rahul" })
public class AppConfig 
{

	static 
	{
		System.out.println("AppConfig.enclosing_method()");
	}

	public AppConfig() 
	{
		System.out.println("AppConfig.AppConfig()");
	}

	@Bean(value = "dt1")
	public LocalDateTime createObj1() 
	{
		System.out.println("AppConfig.createObj1()");
		return LocalDateTime.now();
	}

	@Bean(value = "dt2")
	public LocalDateTime createObj2() 
	{
		System.out.println("AppConfig.createObj2()");
		return LocalDateTime.now();
	}

}
