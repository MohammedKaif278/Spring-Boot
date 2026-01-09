package com.employeesearch.serviceimplementation;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeesearch.dao.EmployeeRepository;
import com.employeesearch.model.Employee;
import com.employeesearch.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void insertEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		
		return employeeRepository.findByName(name);
	}

	@Override
	public List<Employee> getEmployeeByDepartment(String department) {
		// TODO Auto-generated method stub
		return employeeRepository.findByDepartment(department);
	}

	@Override
	public List<Employee> getEmployeeSalaryGreaterThanEqual(double salary) {
		
		return employeeRepository.findBySalaryGreaterThanEqual(salary);
	}

	@Override
	public List<Employee> getEmployeeByDesignation(String designation) {
		return employeeRepository.findByDesignation(designation);
	}

	@Override
	public List<Employee> getEmployeeByJoiningDateAfter(LocalDateTime dateOfJoining) {
		// TODO Auto-generated method stub
		return employeeRepository.findByDateOfJoiningAfter(dateOfJoining);
	}

	
}
