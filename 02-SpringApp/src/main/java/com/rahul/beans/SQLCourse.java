package com.rahul.beans;

public class SQLCourse implements ICourses {

	public SQLCourse() {
		System.out.println("SQLCourse.SQLCourse()");
	}

	@Override
	public boolean courseSelection() {

		System.out.println("SQL Selected");

		return true;

	}

}
