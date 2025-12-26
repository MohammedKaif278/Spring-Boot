package com.example.demo;

import org.springframework.stereotype.Component;

@Component("cc")
public class CreditCardPayment implements Payment
{

	@Override
	public void payment(double amount) {
		System.out.println("Application Started");
		System.out.println("Credit Card Payment Selected");
		System.out.println("Processing payment of "+amount+" using Credit Card");
		System.out.println("Payment Successful");
		
	}

}
