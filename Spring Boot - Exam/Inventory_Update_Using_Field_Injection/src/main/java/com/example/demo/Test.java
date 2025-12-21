package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.demo")
public class Test {
	public static
	void main(String[] args) {
		ApplicationContext con =new AnnotationConfigApplicationContext(Test.class);
		SalesService salesService = con.getBean(SalesService.class);
		salesService.sellProduct("101", 2);
	}
}
