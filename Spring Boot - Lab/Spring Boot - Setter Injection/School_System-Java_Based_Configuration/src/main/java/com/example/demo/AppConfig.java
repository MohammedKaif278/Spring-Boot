package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Student student()
	{
		Student student = new Student();
		student.setRollNo(15);
		student.setStudentName("kaif");
		student.setGrade("A+");
		return student;
	}
	
	@Bean
	public StudentViewer viewer()
	{
		StudentViewer viewer = new StudentViewer();
		viewer.setStudent(student());
		return viewer;
	}
}
