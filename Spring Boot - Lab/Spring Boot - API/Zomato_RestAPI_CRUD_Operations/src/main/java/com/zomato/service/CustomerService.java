package com.zomato.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomato.dao.CustomerDAO;
import com.zomato.model.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	
	
	//Insert
	public String save(Customer c)
	{
		return customerDAO.insertCustomer(c);
	}
	
	
	//update
	public String update(Customer c)
	{
		return customerDAO.updateCustomer(c);
	}
	
	
	//Delete
	public String delete(int cid)
	{
		return customerDAO.deleteCustomer(cid);
	}
	
	//Fetch Customer by cid
	public Customer getCustomer(int cid)
	{
		return customerDAO.getCustomer(cid);
	}
	
	//Fetch All Customer
	public List<Customer> getAllCustomers()
	{
		return customerDAO.getAllCustomer();
	}
}
