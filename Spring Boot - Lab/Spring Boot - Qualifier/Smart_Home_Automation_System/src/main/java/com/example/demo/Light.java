package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("light")
public class Light implements Appliance{

	private PowerSource powerSource;
	
	
	@Autowired
	public Light(@Qualifier("battery") PowerSource powerSource) {
		super();
		this.powerSource = powerSource;
	}



	@Override
	public void operate() {
		System.out.println("Light is on using "+powerSource.supplyPower());
		
	}

}
