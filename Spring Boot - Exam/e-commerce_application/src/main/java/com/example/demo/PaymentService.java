package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
	
//	public PaymentService() {
//		super();
//	}

	public void processPayment(double amount)
	{
		if(amount>0)
		{
			System.out.println("Payment Successful");
		}
		else
		{
			System.out.println("Check your amount");
		}
	}
}
