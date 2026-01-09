package com.employeesearch.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeesearch.model.Employee;
import java.time.LocalDateTime;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	public List<Employee> findByName(String name);
	
	public List<Employee> findByDepartment(String department);
	
	public List<Employee> findBySalaryGreaterThanEqual(double salary);

	public List<Employee> findByDesignation(String designation);
	
	public List<Employee> findByDateOfJoiningAfter(LocalDateTime dateOfJoining);
}
