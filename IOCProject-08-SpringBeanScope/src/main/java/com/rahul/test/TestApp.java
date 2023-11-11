package com.rahul.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.component.WishMessageGenerator;

public class TestApp 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/rahul/cfg/applicationContext.xml");
		
		WishMessageGenerator wmg1 = context.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg1.hashCode());
		
		WishMessageGenerator wmg2 = context.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg2.hashCode());
		
		context.close();
	}
}
