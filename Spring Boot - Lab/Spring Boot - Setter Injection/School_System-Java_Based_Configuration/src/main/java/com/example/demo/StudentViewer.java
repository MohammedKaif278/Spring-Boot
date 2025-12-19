package com.example.demo;

public class StudentViewer {
	Student student;

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void showDetails()
	{
		student.printStudent();
	}
}
