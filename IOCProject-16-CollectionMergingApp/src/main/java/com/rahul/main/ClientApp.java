package com.rahul.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.comp.EnggCourse;

public class ClientApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/rahul/cfg/applicationContext.xml");
		
		EnggCourse course = context.getBean("CS", EnggCourse.class);
		System.out.println(course);
		
		context.close();
	}
}
