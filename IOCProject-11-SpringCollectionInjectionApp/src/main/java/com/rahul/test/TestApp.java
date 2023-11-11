package com.rahul.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.component.College;
import com.rahul.component.ContactsInfo;
import com.rahul.component.MarksInfo;
import com.rahul.component.UniversityInfo;

public class TestApp {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/rahul/cfg/applicationContext.xml");
		
		System.out.println("Bean ID :: " + Arrays.toString(context.getBeanDefinitionNames()));
		
		System.out.println();

		MarksInfo info = context.getBean("marks", MarksInfo.class);
		System.out.println(info);

		System.out.println();

		College college = context.getBean("std", College.class);
		System.out.println(college);

		System.out.println();

		ContactsInfo contactsInfo = context.getBean("contact", ContactsInfo.class);
		System.out.println(contactsInfo);

		System.out.println();

		UniversityInfo university = context.getBean("university", UniversityInfo.class);
		System.out.println(university);

		context.close();
	}
}
