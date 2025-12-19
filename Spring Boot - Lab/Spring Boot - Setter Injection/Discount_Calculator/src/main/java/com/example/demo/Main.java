package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("discount.xml");
		
		DiscountCalculator dis=ac.getBean("discount",DiscountCalculator.class);
		System.out.println("Discounted Amount : "+dis.calculateDiscount());
				
		
	}
}
