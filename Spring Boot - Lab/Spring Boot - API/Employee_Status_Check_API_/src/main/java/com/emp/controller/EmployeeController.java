package com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Employee;
import com.emp.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/details")
	public Employee displayEmployee()
	{
		return employeeService.getEmployee();
	}
	
	@GetMapping("/status")
	public String getStatus() {
		return employeeService.checkStatus();
	}
	
	@GetMapping("/check-salary/{amount}")
	public String getMethodName(@PathVariable double amount) {
		return employeeService.checkSalary(amount);
	}
}
