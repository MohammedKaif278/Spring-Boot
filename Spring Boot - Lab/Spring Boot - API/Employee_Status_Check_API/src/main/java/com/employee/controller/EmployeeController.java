package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Service.EmployeeService;
import com.employee.model.Employee;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employee")
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
