package com.rahul.beans;

public class DebitCard implements IPay {

	public DebitCard() {
		System.out.println("Debit Card Object created by IOC");
	}

	@Override
	public boolean payBill(Double amt) {

		System.out.println("Paying bill through Debit Card");

		return true;

	}

}
