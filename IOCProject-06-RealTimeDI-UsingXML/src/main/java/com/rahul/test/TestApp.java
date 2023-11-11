package com.rahul.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.rahul.controller.MainController;
import com.rahul.vo.CustomerVO;

public class TestApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Emter the customerName :: ");
		String customerName = sc.next();

		System.out.println("Enter the customerAddress :: ");
		String customerAddress = sc.next();

		System.out.println("Enter the principalAmount :: ");
		String pamt = sc.next();

		System.out.println("Enter the rate of interest :: ");
		String rate = sc.next();

		System.out.println("Enter the time period :: ");
		String time = sc.next();

		CustomerVO vo = new CustomerVO();
		vo.setCustomerAddress(customerAddress);
		vo.setCustomerName(customerName);
		vo.setPamt(pamt);
		vo.setRate(rate);
		vo.setTime(time);

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/rahul/cfg/applicationContext.xml");
		System.out.println("*******Container Started*******");

		MainController controller = factory.getBean("customerController", MainController.class);

		try {
			String result = controller.processCustomer(vo);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Internal Problem... Try again... " + e.getMessage());
		}

		System.out.println(controller);
		System.out.println("*******Container Stopped*******");

		sc.close();

	}

}
