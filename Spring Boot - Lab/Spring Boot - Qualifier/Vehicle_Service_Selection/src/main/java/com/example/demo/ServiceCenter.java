package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServiceCenter {
	@Autowired
	@Qualifier("car")
	VehicleService vehicleService;
	
	public void display()
	{
		vehicleService.performService();
	}
	
}
