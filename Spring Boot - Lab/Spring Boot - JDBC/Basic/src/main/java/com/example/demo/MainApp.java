package com.example.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(jdbcConfig.class);
		StudentOperations studentOperations = con.getBean(StudentOperations.class);
		
		//Insert
		//studentOperations.addStudent(new Student(1,"Mohammed",98));
		
		//Update
		//studentOperations.updateStudent(new Student(1,"Mohammed Kaif",95));
		
		//Delete 
		//studentOperations.deleteStudent(1);
		
		//retrive one
		System.out.println(studentOperations.getStudent(90));
		
		//retrive All
		List<Student> students = studentOperations.getAllStudents();
		for(Student s : students)
		{
			System.out.println(s);
		}
		
	}
}
