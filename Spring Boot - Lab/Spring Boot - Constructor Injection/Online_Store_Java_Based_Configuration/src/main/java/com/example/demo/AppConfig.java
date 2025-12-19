package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Product getProduct()
	{
		return new Product(101, "Iphone-12", "Apple");
	}
	
	
	@Bean
	public ProductDisplay getProductDisplay()
	{
		return new ProductDisplay(getProduct());
	}
}
