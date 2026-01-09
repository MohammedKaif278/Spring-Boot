package com.employeesearch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeesearch.model.Employee;
import com.employeesearch.service.EmployeeService;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/insertEmployee")
	public String insertEmployee(@RequestBody Employee employee ) {
		
		employeeService.insertEmployee(employee);
		
		return "Employee Insert Successfully";
	}
	
	@GetMapping("/getEmployeeByName")
	public List<Employee> getEmployeeByName(@RequestParam String name) {
		return employeeService.getEmployeeByName(name);
	}
	
	@GetMapping("/getEmployeeByDepartment")
	public List<Employee> getEmployeeByDepartment(@RequestParam String department) {
		return employeeService.getEmployeeByDepartment(department);
	}
	
	@GetMapping("/getEmployeeSalaryGreaterThanEqual")
	public List<Employee> getMethodName(@RequestParam double salary) {
		return employeeService.getEmployeeSalaryGreaterThanEqual(salary);
	}
	
	@GetMapping("/getEmployeeByDesignation")
	public List<Employee> getEmployeeByDesignation(@RequestParam String designation) {
		return employeeService.getEmployeeByDesignation(designation);
	}
	
	@GetMapping("/getEmployeeByJoiningDateAfter")
	public List<Employee> getEmployeeByJoiningDateAfter(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime dateOfJoining) {
		return employeeService.getEmployeeByJoiningDateAfter(dateOfJoining);
	}
	
	
}
