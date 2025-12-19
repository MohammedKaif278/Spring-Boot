package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("application-context.xml");
		Factory factory=con.getBean("factory",Factory.class);
		 System.out.println(factory);
	}
}
