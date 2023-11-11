package com.rahul.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.component.PersonInfo;

public class TestApp {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/rahul/cfg/applicationContext.xml");
		
		System.out.println("Bean ID :: " + Arrays.toString(context.getBeanDefinitionNames()));
		
		System.out.println();

		PersonInfo info = context.getBean("pinfo", PersonInfo.class);
		System.out.println(info);

		context.close();
	}
}
