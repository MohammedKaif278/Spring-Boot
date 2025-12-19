package com.example.demo;

public class EmployeeController {

	Employee employee;

	public EmployeeController(Employee employee) {
		super();
		this.employee = employee;
	}
	
	public void printInfo()
	{
		employee.introduce();
	}
}
