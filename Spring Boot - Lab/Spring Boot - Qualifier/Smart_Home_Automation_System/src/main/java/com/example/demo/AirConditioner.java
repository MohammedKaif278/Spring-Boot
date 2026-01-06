package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("airconditioner")
public class AirConditioner implements Appliance{

	private PowerSource powerSource;
	
	@Autowired
	public AirConditioner(@Qualifier("electricity") PowerSource powerSource) {
		super();
		this.powerSource = powerSource;
	}


	@Override
	public void operate() {
		System.out.println("Air Conditioner cooling using "+powerSource.supplyPower());
		
	}

}
