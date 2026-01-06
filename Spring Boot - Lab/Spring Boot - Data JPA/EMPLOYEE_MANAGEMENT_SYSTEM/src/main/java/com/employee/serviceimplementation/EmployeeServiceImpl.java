package com.employee.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeRepository;
import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void saveEmployee(Employee employee) {
		 employeeRepository.save(employee);
		 
	}
	
	
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
		
	}

	@Override
	public Employee getEmployee(Integer id) {
		return employeeRepository.findById(id).get();
		
	}


	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}


	@Override
	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
		
	}


	

	

}
