package com.example.demo;

import org.springframework.stereotype.Component;

@Component("truck")
public class TruckService implements VehicleService{

	@Override
	public void performService() {
		System.out.println("Performing truck maintenance: Oil change & Engine check");
		
	}

}
