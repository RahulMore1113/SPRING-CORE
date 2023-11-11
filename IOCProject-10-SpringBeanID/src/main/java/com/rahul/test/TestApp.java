package com.rahul.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.component.Student;

public class TestApp 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/rahul/cfg/applicationContext.xml");
		System.out.println("Bean ID :: " + Arrays.toString(context.getBeanDefinitionNames()));
		
		Student student = context.getBean("com.rahul.component.Student#0", Student.class);
		System.out.println(student);
		
		context.close();
	}
}
