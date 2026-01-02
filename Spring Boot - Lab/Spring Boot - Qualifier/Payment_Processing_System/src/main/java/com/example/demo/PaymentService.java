package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	
	@Autowired
	@Qualifier("cc")
	private Payment payment; // Field Injection
	
	
	public void display(double amount)
	{
		payment.payment(amount);
	}
}
