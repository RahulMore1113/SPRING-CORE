package com.rahul.beans;

public class JavaCourse implements ICourses {

	public JavaCourse() {
		System.out.println("JavaCourse.JavaCourse()");
	}

	@Override
	public boolean courseSelection() {

		System.out.println("Java Selected");

		return true;

	}

}
