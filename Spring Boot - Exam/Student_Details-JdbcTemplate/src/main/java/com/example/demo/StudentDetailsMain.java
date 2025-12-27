package com.example.demo;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentDetailsMain {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(AppConfig.class);
		StudentOperations studentOperations = con.getBean(StudentOperations.class);
		
		//Insert Student
		//System.out.println(studentOperations.insertStudnet(new StudentDetails(1,"mohammed kaif","dalvikaif@gmail.com")));
		//System.out.println(studentOperations.insertStudnet(new StudentDetails(2,"mohammed ","kaifdalvi72@gmail.com")));

		
		//Update Email
		//System.out.println(studentOperations.updateEmail("DalviKaif@gmail.com", 1));
		
		
		//Fetch All Student
//		List<StudentDetails> students=studentOperations.getAllStudent();
//		for(StudentDetails s:students)
//		{
//			System.out.println(s);
//		}
		
		
		//Delete Student
		System.out.println(studentOperations.deleteStudent(1));
		
	}
}
