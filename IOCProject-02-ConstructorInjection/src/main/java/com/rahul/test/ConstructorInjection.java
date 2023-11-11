package com.rahul.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.rahul.component.WishMessageGenerator;

public class ConstructorInjection 
{
	public static void main(String[] args) 
	{
		FileSystemResource resource = new FileSystemResource("src/com/rahul/cfg/applicationContext.xml");
		
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		
		WishMessageGenerator bean = factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(bean);
		
		String result = bean.generateMessage("Rahul");
		System.out.println(result);
	}
}
  