package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Patient {

	private int patientId=101;
	private String name="abc";
	private String disease="fever";
	
	public void showPatient()
	{
		System.out.println("patientId : "+patientId);
		System.out.println("name : "+name);
		System.out.println("disease : "+disease);
	}
}
