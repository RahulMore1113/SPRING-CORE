package com.rahul.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.comp.Employee;

public class ClientApp 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rahul/cfg/applicationContext.xml");
		
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee);
		
		((AbstractApplicationContext) context).close();
	}
}
