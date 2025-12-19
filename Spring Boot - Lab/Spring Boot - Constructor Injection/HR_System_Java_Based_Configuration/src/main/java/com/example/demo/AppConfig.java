package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Employee getEmployee()
	{
		return new Employee(101, "MKD", "IT");
	}
	
	@Bean
	public EmployeeController getEmployeeController()
	{
		return new EmployeeController(getEmployee());
	}
}
