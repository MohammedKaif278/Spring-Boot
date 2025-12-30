package com.emp.service;

import org.springframework.stereotype.Service;

import com.employee.model.Employee;

@Service
public class EmployeeService {
Employee emp=new Employee(101, "kaif", "SDE", 20000.0, false);
	
	public Employee getEmployee()
	{
		return emp;
	}
	
	public String checkStatus()
	{
		if(emp.isActive())
		{
			return "Employee is active";
		}
		else
		{
			return "Employee is In-active";
		}
	}
	
	public String checkSalary(double amount)
	{
		if(emp.getSalary()>amount)
		{
			return "Salary is above "+amount;
		}
		else
		{
			return "Salary is below "+amount;
		}
	}
}
