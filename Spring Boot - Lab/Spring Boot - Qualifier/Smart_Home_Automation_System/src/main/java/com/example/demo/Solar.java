package com.example.demo;

import org.springframework.stereotype.Component;

@Component("solar")
public class Solar implements PowerSource{

	@Override
	public String supplyPower() {
		
		return "Solar";
	}

}
