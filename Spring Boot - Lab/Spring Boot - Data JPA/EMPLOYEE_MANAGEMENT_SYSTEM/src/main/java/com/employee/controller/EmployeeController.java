package com.employee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/create")
	public String createEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		
		return "Employee Created Successfully";
	}
	
	@GetMapping("/all")
	public List<Employee> getAllEmployee(Employee employee) {
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		return employeeService.getEmployee(id);
	}
	
	@PutMapping("/update")
	public String updateEmployee( @RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		
		return "Employee Update Successfully";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable Integer id)
	{
		employeeService.deleteEmployee(id);
		return "Employee Deleted Successfully";
	}
	
	
	
}
