package com.rahul.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		context.getBean("credit", CreditCard.class);
		context.getBean("debit", DebitCard.class);
		PaymentProcess process = context.getBean("payment", PaymentProcess.class);
		process.doPayment(100.0);

	}

}
