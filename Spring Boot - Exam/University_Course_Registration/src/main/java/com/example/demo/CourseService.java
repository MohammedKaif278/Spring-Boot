package com.example.demo;

import java.util.List;

public class CourseService {
	
	Student student;
	
	List<String> courses;

	public void setStudent(Student student) {
		this.student = student;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "CourseService [student=" + student + ", courses=" + courses + "]";
	}
	
}
