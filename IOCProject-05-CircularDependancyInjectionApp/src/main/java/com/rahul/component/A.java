package com.rahul.component;

public class A 
{
	private B b;
	
	static
	{
		System.out.println("A.class file is loading");
	}
	
	public A() 
	{
		System.out.println("A :: 0 param Constructor");
	}

	public A(B b) 
	{
		this.b = b;
		System.out.println("A.A() :: 1 param constructor");
	}

	public void setB(B b) 
	{
		this.b = b;
		System.out.println("A.setB()");
	}

	@Override
	public String toString() 
	{
		return "A [b=" + b + "]";
	}
}
