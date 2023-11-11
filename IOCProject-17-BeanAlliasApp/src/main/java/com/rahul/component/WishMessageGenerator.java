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
		System.out.println("WishMessageGenerator object is instantiated");
	}

	public void setDate(Date date) 
	{
		this.date = date;
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

}
