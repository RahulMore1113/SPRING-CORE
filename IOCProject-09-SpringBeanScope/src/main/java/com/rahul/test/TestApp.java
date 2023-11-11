package com.rahul.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.component.Printer;

public class TestApp 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/rahul/cfg/applicationContext.xml");
		
		Printer printer = context.getBean("printer", Printer.class);
		System.out.println(printer);
		
		context.close();
	}
}
