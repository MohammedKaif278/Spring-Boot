package com.employeesearch.service;

import java.time.LocalDateTime;
import java.util.List;

import com.employeesearch.model.Employee;

public interface EmployeeService {

	void insertEmployee(Employee employee);

	List<Employee> getEmployeeByName(String name);

	List<Employee> getEmployeeByDepartment(String department);

	List<Employee> getEmployeeSalaryGreaterThanEqual(double salary);

	List<Employee> getEmployeeByDesignation(String designation);

	List<Employee> getEmployeeByJoiningDateAfter(LocalDateTime dateOfJoining);

	 

}
