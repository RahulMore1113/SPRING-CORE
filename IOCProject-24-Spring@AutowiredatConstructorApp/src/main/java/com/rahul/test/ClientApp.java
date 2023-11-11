package com.rahul.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.comp.Flipkart;

public class ClientApp 
{
	public static void main(String[] args) 
	{
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/rahul/cfg/applicationContext.xml");
		
		Flipkart flipkart = factory.getBean("fpkt", Flipkart.class);
		System.out.println(flipkart.doShopping(new String[] {"fossil","tissot"}, new float [] {23586.9f,48776.6f}));
		
		((AbstractApplicationContext) factory).close();
	}
}
