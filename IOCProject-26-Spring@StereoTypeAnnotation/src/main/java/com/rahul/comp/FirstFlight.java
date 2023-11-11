package com.rahul.comp;

import org.springframework.stereotype.Component;

@Component(value = "fFlight")
public class FirstFlight implements Courier 
{
	
	static
	{
		System.out.println("FirstFlight..class file is loading");
	}
	
	public FirstFlight()
	{
		System.out.println("FirstFlight :: Zero param Constructor");
	}

	@Override
	public String deliver(int oid) 
	{
		System.out.println("FirstFlight.deliver()");
		return "FirstFlight Courier will deliverd with the order id :: " + oid + " for the ordered products";
	}

}
