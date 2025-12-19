package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.example.demo")
public class Test {
	public static void main(String[] args)
	{
		ApplicationContext ac=new AnnotationConfigApplicationContext(Test.class);
		ac.getBean(Customer.class);
	}
}
