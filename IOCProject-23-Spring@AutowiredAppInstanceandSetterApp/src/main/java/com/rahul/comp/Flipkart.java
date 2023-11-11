package com.rahul.comp;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart 
{
	@Autowired
	@Qualifier("dtdc")
	private Courier courier;
	private Float discount;
	
	static
	{
		System.out.println("Flipkart.class file is loading");
	}
	
	public Flipkart()
	{
		System.out.println("Flipkart object is instantiated");
	}
	
	public void setCourier(Courier courier) 
	{
		this.courier = courier;
		System.out.println("Flipkart.setCourier()");
	}
	
	public void setDiscount(Float discount)
	{
		this.discount = discount;
		System.out.println("Flipkart.setDiscount()");
	}
	
	public String doShopping(String[] items, float prices[])
	{
		System.out.println("Flipkart.doShopping");
		System.out.println("Implementation class is :: " + courier.getClass().getName());
		System.out.println("Discount amount is :: " + discount);
		
		int oid = 0;
		float billAmt = 0.0f;
		Random random = null;
		
		for (float price : prices)
			billAmt+=price;
		
		random = new Random();
		oid = random.nextInt(1000);
		
		System.out.println("Ordered id is :: " + oid);
		String msg = courier.deliver(oid);
		
		return Arrays.toString(items) + " are purchased having prices " + Arrays.toString(prices) 
										+ " with billAmount of " + billAmt + " ----> " + msg;
	}

	@Override
	public String toString() 
	{
		return "Flipkart [courier=" + courier + ", discount=" + discount + "]";
	}

}
