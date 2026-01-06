package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeService {
	
	void saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();
	
	public Employee getEmployee(Integer id);
	
	void updateEmployee(Employee employee);
	
	

	void deleteEmployee(Integer id);
}
