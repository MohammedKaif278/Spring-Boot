package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Restaurant restaurant()
	{
		return new Restaurant(101, "Shadab", "Biryani", 5, 500);
	}
	
	@Bean
	public RestaurantViewer restaurantViewer()
	{
		return new RestaurantViewer(restaurant());
	}
}
