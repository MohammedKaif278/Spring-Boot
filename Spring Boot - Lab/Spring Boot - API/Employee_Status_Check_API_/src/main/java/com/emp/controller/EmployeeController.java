package com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.emp.model.Employee;
import com.emp.service.EmployeeService;

public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	public Employee displayEmployee()
	{
		return employeeService.getEmployee();
	}
	
	@GetMapping("/employee/status")
	public String getStatus() {
		return employeeService.checkStatus();
	}
	
	@GetMapping("/employee/check-salary/{amount}")
	public String getMethodName(@PathVariable double amount) {
		return employeeService.checkSalary(amount);
	}
}
