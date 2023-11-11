package com.rahul.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.rahul.component.Student;

@SuppressWarnings("deprecation")
public class BeanFactoryApp {

	public static void main(String[] args) {

		FileSystemResource resource = new FileSystemResource("src/com/rahul/cfg/applicationContext.xml");

		XmlBeanFactory factory = new XmlBeanFactory(resource);

		Student bean1 = factory.getBean("std1", Student.class);
		System.out.println(bean1);

		System.out.println();

		Student bean2 = factory.getBean("std2", Student.class);
		System.out.println(bean2);

		System.out.println();

		Student bean3 = factory.getBean("std3", Student.class);
		System.out.println(bean3);

	}

}
