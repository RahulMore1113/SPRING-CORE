package com.rahul.component;

public class BlueDart implements Courier 
{

	static
	{
		System.out.println("BlueDart..class file is loading");
	}
	
	public BlueDart()
	{
		System.out.println("BlueDart :: Zero param Constructor");
	}
	
	@Override
	public String deliver(int oid) 
	{
		System.out.println("BlueDart.deliver()");
		return "BlueDart Courier will deliverd with the order id :: " + oid + " for the ordered products";
	}

}
