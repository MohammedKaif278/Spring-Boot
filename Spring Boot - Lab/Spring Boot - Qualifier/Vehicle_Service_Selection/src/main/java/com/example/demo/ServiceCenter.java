package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServiceCenter {
	
	//Field Injection
//	@Autowired
//	@Qualifier("car")
//	private VehicleService vehicleService;
	
	//Setter Injection
	private VehicleService vehicleService;
	@Autowired
	@Qualifier("car")
	public void setVehicleService(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}
	
	
	//Connstructor Injection
//	@Autowired
//	public ServiceCenter(@Qualifier("car") VehicleService vehicleService) {
//		super();
//		this.vehicleService = vehicleService;
//	}

	public void display()
	{
		vehicleService.performService();
	}
	
	
}
