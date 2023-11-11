package com.rahul.component;

import java.util.Date;
import java.util.Set;

public class ContactsInfo {

	private Set<Long> phoneNumber;
	private Set<Date> dates;

	@Override
	public String toString() {
		return "ContactsInfo [phoneNumber=" + phoneNumber + ", dates=" + dates + "]";
	}

	public void setPhoneNumber(Set<Long> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setDates(Set<Date> dates) {
		this.dates = dates;
	}

}
