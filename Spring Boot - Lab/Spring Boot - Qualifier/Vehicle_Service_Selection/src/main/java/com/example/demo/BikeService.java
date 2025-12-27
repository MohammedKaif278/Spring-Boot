package com.example.demo;

import org.springframework.stereotype.Component;

@Component("bike")
public class BikeService implements VehicleService{

	@Override
	public void performService() {
		System.out.println("Performing bike maintenance: Oil change & Engine check");
		
	}

}
