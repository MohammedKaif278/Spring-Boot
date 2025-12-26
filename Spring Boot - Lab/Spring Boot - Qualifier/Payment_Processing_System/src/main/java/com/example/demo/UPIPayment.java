package com.example.demo;

import org.springframework.stereotype.Component;

@Component("upi")
public class UPIPayment implements Payment{

	@Override
	public void payment(double amount) {
		System.out.println("Application Started");
		System.out.println("UPIPayment Payment Selected");
		System.out.println("Processing payment of "+amount+" using UPIPayment");
		System.out.println("Payment Successful");
		
	}
	
}
