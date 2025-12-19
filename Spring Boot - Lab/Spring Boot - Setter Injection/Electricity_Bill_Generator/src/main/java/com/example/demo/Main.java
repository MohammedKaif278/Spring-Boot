package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("bill.xml");
		
		ElectricityBillGenerator bill=ac.getBean("bill",ElectricityBillGenerator.class);
		System.out.println("Total Electricity Bill : "+bill.generateBill());
	}
}
