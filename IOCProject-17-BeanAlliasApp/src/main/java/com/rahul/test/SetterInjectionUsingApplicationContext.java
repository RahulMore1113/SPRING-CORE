package com.rahul.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.component.WishMessageGenerator;

public class SetterInjectionUsingApplicationContext {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/rahul/cfg/applicationContext.xml");

		System.out.println("*******Container is starting**********");

		System.out.println("No of beans is :: " + context.getBeanDefinitionCount());
		System.out.println("Bean id  is :: " + Arrays.toString(context.getBeanDefinitionNames()));

		System.out.println();

		WishMessageGenerator wmg = context.getBean("wmg", WishMessageGenerator.class);
		System.out.println("HashCode of wmg is :: " + wmg.hashCode());
		System.out.println(wmg);

		System.out.println();

		WishMessageGenerator wishMessageGenerator = context.getBean("wishMessageGenerator", WishMessageGenerator.class);
		System.out.println("HashCode of wishMessageGenerator is :: " + wishMessageGenerator.hashCode());
		System.out.println(wishMessageGenerator);

		System.out.println("\n*******Container is closing**********");
		((AbstractApplicationContext) context).close();

	}
}