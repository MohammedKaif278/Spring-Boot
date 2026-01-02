package com.zomato.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zomato.model.Customer;
import com.zomato.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
	
	@Autowired
	CustomerService customerService;
	
	//Create
	@PostMapping("/save")
	public String saveCustomer(@RequestBody Customer c) {
		return customerService.save(c);
	}
	
	//Update
	@PutMapping("/update")
	public String update(@RequestBody Customer c ) {
		return customerService.update(c);
	}
	
	//Delete
	@DeleteMapping("/delete/{cid}")
	public String delete(@PathVariable int cid)
	{
		return customerService.delete(cid);
	}
	
	//Fetch Customer by cid
	@GetMapping("/{cid}")
	public Customer getCustomer(@PathVariable int cid) {
		return customerService.getCustomer(cid);
	}
	
	
	//Fetch All Customer 
	@GetMapping("/all")
	public List<Customer> getAllCustomers()
	{
		return customerService.getAllCustomers();
	}
	
	
}
