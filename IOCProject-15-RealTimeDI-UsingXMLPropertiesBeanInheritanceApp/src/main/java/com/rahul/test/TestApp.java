package com.rahul.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rahul.controller.MainController;
import com.rahul.vo.CustomerVO;

public class TestApp {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the customerName :: ");
		String customerName = scanner.next();

		System.out.print("Enter the customerAddress :: ");
		String customerAddress = scanner.next();

		System.out.print("Enter the principalAmount :: ");
		String pamt = scanner.next();

		System.out.print("Enter the Rate of Interest :: ");
		String rate = scanner.next();

		System.out.print("Enter the TimePeriod :: ");
		String time = scanner.next();

		CustomerVO customerVO = new CustomerVO();
		customerVO.setCustomerAddress(customerAddress);
		customerVO.setCustomerName(customerName);
		customerVO.setPamt(pamt);
		customerVO.setRate(rate);
		customerVO.setTime(time);

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("com/rahul/cfg/applicationContext.xml");
		
		System.out.println("*******Container Started*******");

		MainController controller = factory.getBean("customerController", MainController.class);

		try {
			String result = controller.processCustomer(customerVO);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Internal Problem... Try again... " + e.getMessage());
		}

		System.out.println(controller);

		System.out.println("*******Container Stopped*******");

		scanner.close();
		factory.close();

	}
}
