package com.rahul.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rahul/cfg/applicationContext.xml");
		
		Locale locale = new Locale(args[0], args[1]);
		
		System.out.println(context.getMessage("btn1.cap", null, locale));
		System.out.println(context.getMessage("btn2.cap", null, locale));
		System.out.println(context.getMessage("btn3.cap", null, locale));
		System.out.println(context.getMessage("btn4.cap", null, locale));
		
		System.out.println();
		
		System.out.println(context.getMessage("btn1.cap", new String[] { "Student" }, locale));

		((AbstractApplicationContext) context).close();
	}
}
