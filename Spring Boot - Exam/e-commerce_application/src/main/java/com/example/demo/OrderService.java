package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
	
	PaymentService paymentService;

	public OrderService(PaymentService paymentService) {
		super();
		this.paymentService = paymentService;
	}
	
	
	public void placeOrder(String orderId, double amount)
	{
		paymentService.processPayment(amount);
		System.out.println(" order is successfully placed");
	}
}
