package com.example.demo;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEngine implements Engine{

	@Override
	public void start(String msg) {
		System.out.println("Vehicle Manufacturing System Started");
		System.out.println(msg+" Engine Selected");
		System.out.println(msg+" Engine Started Successfully");
		System.out.println("Vehicle Manufacturing System Started");
		
		
	}

}
