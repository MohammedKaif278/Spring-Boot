package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentCrudApplicationApplication {
	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(jdbcConfig.class);
		StudentOperations studentOperations = con.getBean(StudentOperations.class);
		
		//Table Created
		//System.out.println(studentOperations.createTable());
		
		
		//Student Insert
		//System.out.println(studentOperations.addStudnet(new Student(1,"kaif",95)));
		//System.out.println(studentOperations.addStudnet(new Student(2,"Mohammed",99)));
		
		//Student Updated
		//System.out.println(studentOperations.updateStudent(99, 1));
	
		//Student Deleted
		//System.out.println(studentOperations.deleteStudent(1));
	
		//Fetch Student by ID
		//System.out.println(studentOperations.getStudent(1));
	
		//Fetch All Student
		System.out.println(studentOperations.getAllStudents());
	}
}
