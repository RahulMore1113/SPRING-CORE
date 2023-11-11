package com.rahul.beans;

public class CourseSelection {

	private ICourses courses;

	public void setCourses(ICourses courses) {
		this.courses = courses;
	}

	public void selectCourses() {
		boolean status = courses.courseSelection();
		if (status)
			System.out.println("Course Selected");
		else
			System.out.println("Course Failed");
	}

}
