package com.rahul.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.comp.Flipkart;

public class ClientApp 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rahul/cfg/applicationContext.xml");
		System.out.println("Bean id information :: " + Arrays.toString(context.getBeanDefinitionNames()));
		
		Flipkart flipkart = context.getBean(Flipkart.class);
		System.out.println(flipkart.doShopping(new String[] {"fossil","tissot"}, new float [] {23586.9f,48776.6f}));
		
		((AbstractApplicationContext) context).close();
	}
}
