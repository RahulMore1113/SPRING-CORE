package com.rahul.beans;

public class CreditCard implements IPay {

	public CreditCard() {
		System.out.println("Credit Card Object is created by IOC");
	}

	@Override
	public boolean payBill(Double amt) {

		System.out.println("Paying bill through Credit Card");

		return true;

	}

}
