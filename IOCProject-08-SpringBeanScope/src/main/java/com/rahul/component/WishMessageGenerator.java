package com.rahul.component;

import java.util.Date;

public class WishMessageGenerator 
{
	private Date date;
	
	static
	{
		System.out.println("WishMessageGenerator.class file is loading");
	}
	
	public WishMessageGenerator()
	{
		System.out.println("WishMessageGenerator object is instantiated with zero param constructor");
	}
	
	public void setDate(Date date) 
	{
		this.date = date;
		System.out.println("Setter method is called to perform setter injection");
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}

}
