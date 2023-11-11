package com.rahul.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.component.WishMessageGenerator;

public class TestApp 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/rahul/cfg/applicationContext.xml");
		
		System.out.println("Bean count is :: " + context.getBeanDefinitionCount());
		System.out.println("Bean id is :: " + Arrays.toString(context.getBeanDefinitionNames()));
		
		WishMessageGenerator wmg = context.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg);
		
		context.close();
	}
}
