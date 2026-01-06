package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("heater")
public class Heater implements Appliance{

	private PowerSource powerSource;
	
	@Autowired
	public Heater(@Qualifier("electricity") PowerSource powerSource) {
		super();
		this.powerSource = powerSource;
	}



	@Override
	public void operate() {
		System.out.println("Heater heating using "+powerSource.supplyPower());
		
	}

}
