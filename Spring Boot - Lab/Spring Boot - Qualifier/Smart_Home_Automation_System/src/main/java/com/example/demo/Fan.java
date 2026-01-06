package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fan")
public class Fan implements Appliance {

    private final Solar solar;

	private PowerSource powerSource;
	
	@Autowired
	public Fan(@Qualifier("solar") PowerSource powerSource, Solar solar) {
		super();
		this.powerSource = powerSource;
		this.solar = solar;
	}
	
	
	@Override
	public void operate() {
		System.out.println("Fan is running using "+powerSource.supplyPower());
	}

	

}
