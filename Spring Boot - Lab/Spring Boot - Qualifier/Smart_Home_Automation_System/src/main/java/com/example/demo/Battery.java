package com.example.demo;

import org.springframework.stereotype.Component;

@Component("battery")
public class Battery implements PowerSource{

	@Override
	public String supplyPower() {
		// TODO Auto-generated method stub
		return "Battery";
	}

}
