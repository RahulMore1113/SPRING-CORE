package com.rahul.vo;

//VO -> Value Object
public class CustomerVO {

	private String customerName;
	private String customerAddress;
	private String pamt;
	private String rate;
	private String time;

	static {
		System.out.println("CustomerBO class file is loading...");
	}

	public CustomerVO() {
		System.out.println("CustomerBO Object is instantiated...");
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getPamt() {
		return pamt;
	}

	public void setPamt(String pamt) {
		this.pamt = pamt;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "CustomerDTO [customerName=" + customerName + ", customerAddress=" + customerAddress + ", pamt=" + pamt
				+ ", rate=" + rate + ", time=" + time + "]";
	}

}
