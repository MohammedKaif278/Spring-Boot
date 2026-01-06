package com.example.demo;

import org.springframework.stereotype.Component;

@Component("electric")
public class ElectricEngine implements Engine{

	@Override
	public void start(String msg) {
		System.out.println("Vehicle Manufacturing System Started");
		System.out.println(msg+" Engine Selected");
		System.out.println(msg+" Engine Started Successfully");
		System.out.println("Vehicle Manufacturing System Started");
		
		
	}
	
}
