package com.rahul.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.service.UserService;

public class MyAppMain 
{

	public static void main(String[] args) 
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		UserService service = context.getBean(UserService.class);
		service.storeInDB();
		
	}

}
