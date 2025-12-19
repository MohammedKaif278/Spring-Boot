package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Destination destination()
	{
		 Destination destination = new Destination();
		 destination.setDestinationId(101);
		 destination.setName("Hyderabad");
		 destination.setCountry("India");
		 return destination;
	}
	
	@Bean
	public TravelGuide travelGuide()
	{
	   TravelGuide travelGuide = new TravelGuide();
	   travelGuide.setDestination(destination());
	   return travelGuide;
	}
}
