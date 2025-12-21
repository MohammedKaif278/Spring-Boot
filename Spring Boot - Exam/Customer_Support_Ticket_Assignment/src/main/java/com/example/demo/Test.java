package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.example.demo")
public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(Test.class);
		TicketService ticketService = con.getBean(TicketService.class);
		ticketService.createTicket("101");
	}
}
