package com.rahul.beans;

public class PaymentProcess {

	private IPay pay;

	public PaymentProcess(IPay pay) {
		System.out.println("PaymentProcess object is creating");
		this.pay = pay;
	}

	public void setPay(IPay pay) {
		System.out.println("Setter is callled");
		this.pay = pay;
	}

	public void doPayment(Double amt) {
		boolean paymentDone = pay.payBill(amt);

		if (paymentDone)
			System.out.println("Payment Done");
		else
			System.out.println("Payment Failed");
	}

}
