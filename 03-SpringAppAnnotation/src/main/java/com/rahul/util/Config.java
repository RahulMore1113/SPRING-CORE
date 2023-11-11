package com.rahul.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config 
{
	public Config() 
	{
		System.out.println("Config Beans");
	}
	
	@Bean
	public EncPass getInstance()
	{
		EncPass pw = new EncPass("SHA-01");
		return pw;
	}
}
