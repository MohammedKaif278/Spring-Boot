package com.example.demo;

public class Employee {
	private int empId;
	private String empName,department;
	
	public Employee(int empId, String empName, String department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}
	
	public void introduce()
	{
		System.out.println("Employee "+empId+" : "+empName+" from "+department);
	}
}
