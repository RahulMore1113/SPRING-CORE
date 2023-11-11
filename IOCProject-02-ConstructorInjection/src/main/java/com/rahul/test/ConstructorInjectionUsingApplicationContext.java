package com.rahul.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.component.WishMessageGenerator;

public class ConstructorInjectionUsingApplicationContext 
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/rahul/cfg/applicationContext.xml");
		
		WishMessageGenerator bean = context.getBean("wmg", WishMessageGenerator.class);
		System.out.println(bean);
		
		String result = bean.generateMessage("Rahul");
		System.out.println(result);
		
		context.close();
	}
}
  