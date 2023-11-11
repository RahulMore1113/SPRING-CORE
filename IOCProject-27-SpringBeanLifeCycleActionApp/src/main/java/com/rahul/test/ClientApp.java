package com.rahul.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.comp.Voter;

public class ClientApp 
{
	public static void main(String[] args) 
	{
		System.out.println("*****Container Started*****\n");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/rahul/cfg/applicationContext.xml");
		System.out.println("Bean id information :: " + Arrays.toString(context.getBeanDefinitionNames()));

		Voter voter = context.getBean(Voter.class);
		System.out.println(voter);

		System.out.println(voter.checkVotingEligibility());

		((AbstractApplicationContext) context).close();
		System.out.println("\n*****Container Stopped*****");
	}
}
