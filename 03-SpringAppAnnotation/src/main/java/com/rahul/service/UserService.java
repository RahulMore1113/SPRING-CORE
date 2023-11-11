package com.rahul.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.dao.UserDao;

@Service
public class UserService 
{
	@Autowired
	private UserDao userDao;
	
	public UserService() 
	{
		System.out.println("User Service Object is created");
	}
	
	public void storeInDB()
	{
		boolean status = userDao.save();
		if (status)
			System.out.println("Storing Success");
		else
			System.out.println("Failed");
	}
}
