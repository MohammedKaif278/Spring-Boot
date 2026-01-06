package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
	
	//Field Injection
	
//	@Autowired
//	@Qualifier("petrol")
//	private Engine engine;
	
	
	//Setter Injection
	
//	@Autowired
//	@Qualifier("petrol")
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}
	
	
	//Constructor Injection
	
	private Engine engine;
	
	@Autowired
	public VehicleService(@Qualifier("petrol") Engine engine) {
		super();
		this.engine = engine;
	}





	public void display(String msg)
	{
		engine.start(msg);
	}
}
