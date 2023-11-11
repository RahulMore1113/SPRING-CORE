package com.rahul.test;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.component.Car;

public class TestApp {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/rahul/cfg/applicationContext.xml");
		
		System.out.println("Bean ID :: " + Arrays.toString(context.getBeanDefinitionNames()));
		
		System.out.println();

		Car car1 = context.getBean("car1", Car.class);
		System.out.println(car1);
		Car car2 = context.getBean("car2", Car.class);
		System.out.println(car2);
		/*
		 * Car baseCar = context.getBean("baseCar", Car.class);
		 * System.out.println(baseCar);
		 */

		context.close();
	}
}
