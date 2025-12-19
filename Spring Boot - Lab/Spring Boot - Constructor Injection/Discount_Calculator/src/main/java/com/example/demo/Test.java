package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		DiscountCalculator discountCalculator = con.getBean("dc",DiscountCalculator.class);
		double result=discountCalculator.calculateDiscount();
		System.out.println(result);
	}
}
