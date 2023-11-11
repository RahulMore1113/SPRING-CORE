package com.rahul.test;

import java.util.Date;

import com.rahul.component.WishMessageGenerator;

public class UsingCoreJavaApp 
{
	public static void main(String[] args) 
	{
		Date date = new java.util.Date();
		System.out.println("Creating an Object of Dependant class using zero param constructor :: " + date);
		
		WishMessageGenerator wmg = new WishMessageGenerator(date);
		System.out.println("Creating an object of Target class using parameterized constructor.." + wmg);
		
		String result = wmg.generateMessage("Rahul");
		System.out.println(result);
	}
}
