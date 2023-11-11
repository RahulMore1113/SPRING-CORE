package com.rahul.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao 
{
	public UserDao() 
	{
		System.out.println("User Dao Object is created");
	}
	
	public boolean save()
	{
		System.out.println("Able to save in DB");
		return true;
	}
}
