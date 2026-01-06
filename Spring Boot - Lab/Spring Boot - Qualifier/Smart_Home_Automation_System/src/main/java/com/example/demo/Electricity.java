package com.example.demo;

import org.springframework.stereotype.Component;

@Component("electricity")
public class Electricity implements PowerSource{

	@Override
	public String supplyPower() {
		
		return "Electricity";
	}

}
