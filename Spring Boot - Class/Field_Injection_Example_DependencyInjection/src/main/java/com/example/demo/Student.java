package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Autowired
	Book book;
	
	public void showData()
	{
		System.out.println("Field Injection");
	}
	
}
