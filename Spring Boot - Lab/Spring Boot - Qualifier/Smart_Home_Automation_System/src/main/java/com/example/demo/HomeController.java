package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HomeController {

	@Autowired
	@Qualifier("light")
	private Appliance light;
	
	@Autowired
	@Qualifier("fan")
	private Appliance fan;
	
	@Autowired
	@Qualifier("airconditioner")
	private Appliance airconditioner;
	
	@Autowired
	@Qualifier("heater")
	private Appliance heater;
	
	
	public void controlLight()
	{
		light.operate();
	}
	
	public void controlFan()
	{
		fan.operate();
	}
	
	public void controlAirConditioner()
	{
		airconditioner.operate();
	}
	
	public void controlHeater()
	{
		heater.operate();
	}
}
