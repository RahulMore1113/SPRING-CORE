package com.rahul.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.rahul.cfg.AppConfig;
import com.rahul.comp.WishMessageGenerator;

public class ClientApp 
{
	public static void main(String[] args) 
	{
		System.out.println("*****Container Started*****\n");

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("Bean id information :: " + Arrays.toString(context.getBeanDefinitionNames()));

		WishMessageGenerator wmg = context.getBean(WishMessageGenerator.class);
		System.out.println(wmg);
		
		String result = wmg.generaeWishMessage("Rahul");
		System.out.println(result);

		((AbstractApplicationContext) context).close();
		System.out.println("\n*****Container Stopped*****");
	}
}
