package com.rahul.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.component.PersonInfo;

public class ClientApp 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rahul/cfg/applicationContext.xml");
		
		PersonInfo info = context.getBean(PersonInfo.class);
		System.out.println(info);
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
