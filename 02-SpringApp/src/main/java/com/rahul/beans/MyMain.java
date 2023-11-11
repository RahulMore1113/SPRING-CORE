package com.rahul.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		CourseSelection bean = context.getBean("course", CourseSelection.class);
		bean.selectCourses();

	}

}
