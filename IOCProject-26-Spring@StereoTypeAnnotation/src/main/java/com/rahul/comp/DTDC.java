package com.rahul.comp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "dtdc")
@Primary
public class DTDC implements Courier 
{
	
	static
	{
		System.out.println("DTDC..class file is loading");
	}
	
	public DTDC()
	{
		System.out.println("DTDC :: Zero param Constructor");
	}
	
	@Override
	public String deliver(int oid) 
	{
		System.out.println("DTDC.deliver()");
		return "DTDC Courier will deliverd with the order id :: " + oid + " for the ordered products";
	}

}
