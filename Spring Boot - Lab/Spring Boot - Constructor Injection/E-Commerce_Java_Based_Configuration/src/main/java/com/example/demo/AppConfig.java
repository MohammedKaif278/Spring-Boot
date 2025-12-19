package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Order getOrder()
	{
		return new Order(101, 4, "kaif", "PRIME", 500);
	}
	
	@Bean
	public OrderService getOrderService()
	{
		return new OrderService(getOrder());
	}
}
