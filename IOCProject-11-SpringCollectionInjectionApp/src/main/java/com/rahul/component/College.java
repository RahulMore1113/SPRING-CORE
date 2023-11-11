package com.rahul.component;

import java.util.Date;
import java.util.List;

public class College {

	private List<String> studNames;
	private List<Date> dateList;

	@Override
	public String toString() {
		return "College [studNames=" + studNames + ", dateList=" + dateList + "]";
	}

	public void setStudNames(List<String> studNames) {
		this.studNames = studNames;
	}

	public void setDateList(List<Date> dateList) {
		this.dateList = dateList;
	}

}
