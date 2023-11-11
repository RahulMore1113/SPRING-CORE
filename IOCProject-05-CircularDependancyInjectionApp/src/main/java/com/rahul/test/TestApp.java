package com.rahul.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.rahul.component.A;
import com.rahul.component.B;

public class TestApp 
{
	public static void main(String[] args) 
	{
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/rahul/cfg/applicationContext.xml");
		
		A a1 = factory.getBean("a1", A.class);
//		System.out.println(a1);
		
		System.out.println();
		
		B b1 = factory.getBean("b1", B.class);
//		System.out.println(b1);
	}
}
