package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(AppConfig.class);
		PaymentService paymentService = con.getBean(PaymentService.class);
		paymentService.display(50000);
	}
	
}
