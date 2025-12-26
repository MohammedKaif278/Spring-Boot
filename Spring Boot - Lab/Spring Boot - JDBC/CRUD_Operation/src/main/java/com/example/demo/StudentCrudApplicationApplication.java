package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentCrudApplicationApplication {
	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(jdbcConfig.class);
		StudentOperations studentOperations = con.getBean(StudentOperations.class);
		studentOperations.createTable();
	}
}
