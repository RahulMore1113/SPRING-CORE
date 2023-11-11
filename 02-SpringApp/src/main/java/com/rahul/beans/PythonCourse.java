package com.rahul.beans;

public class PythonCourse implements ICourses {

	public PythonCourse() {
		System.out.println("PythonCourse.PythonCourse()");
	}

	@Override
	public boolean courseSelection() {

		System.out.println("Python Selected");

		return true;

	}

}
