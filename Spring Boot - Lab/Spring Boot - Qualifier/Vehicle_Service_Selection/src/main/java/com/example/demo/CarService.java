package com.example.demo;

import org.springframework.stereotype.Component;

@Component("car")
public class CarService implements VehicleService{

	@Override
	public void performService() {
		System.out.println("Performing car maintenance: Oil change & Engine check");
	}

}
