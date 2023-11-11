package com.rahul.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.rahul.component.Student;

public class AdvancedBeanFactoryApp 
{
	public static void main(String[] args) 
	{
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		
		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/rahul/cfg/applicationContext.xml");
		
		Student student = factory.getBean("std1", Student.class);
		System.out.println(student);
	}
}
