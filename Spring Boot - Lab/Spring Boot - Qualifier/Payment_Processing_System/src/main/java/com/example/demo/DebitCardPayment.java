package com.example.demo;

import org.springframework.stereotype.Component;

@Component("dc")
public class DebitCardPayment implements Payment {

	@Override
	public void payment(double amount) {
		System.out.println("Application Started");
		System.out.println("Debit Card Payment Selected");
		System.out.println("Processing payment of "+amount+" using Debit Card");
		System.out.println("Payment Successful");
		
	}

}
