package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("msg.xml");
		WishMessageGenerator wmg=con.getBean("wmg",WishMessageGenerator.class);
		String result = wmg.generateWishMessage();
		System.out.println(result);
	}
}
