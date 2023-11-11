package com.rahul.component;

import java.util.Date;

public class WishMessageGenerator 
{
	private java.util.Date date;
	
	static
	{
		System.out.println("WishMessageGenerator.class file is loading");
	}
	
	public WishMessageGenerator()
	{
		System.out.println("WishMessageGenerator object is instantiated with zero param constructor");
	}
	
	public WishMessageGenerator(Date date)
	{
		this.date = date;
		System.out.println("WishMessageGenerator :: One Param Constructor.");
	}
	
	public void setDate(java.util.Date date) 
	{
		this.date = date;
		System.out.println("Setter method is called to perform setter injection");
	}

	public String generateMessage(String userName)
	{
		int hours = date.getHours();
		
		if (hours<12)
			return "GOOD MORNING :: " + userName;
		else if (hours <16)
			return "GOOD AFTERNOON :: " + userName;
		else if (hours <20)
			return "GOOD EEVENING :: " + userName;
		else
			return "GOOD NIGHT :: " + userName;
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}

}
