package com.instamart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instamart.model.Instamart;
import com.instamart.service.InstamartService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/orders")
public class InstamartController {

	@Autowired
	private InstamartService instamartService;
	
	@PostMapping("/createorder")
	public String postMethodName(@RequestBody Instamart instamart) {
	
		instamartService.createOrder(instamart);
		
		return "Order Created Successfully";
	}
	
	@GetMapping("/all")
	public List<Instamart> getMethodName() {
		
		return instamartService.getAllOrder();
	}
	
	@GetMapping("/{id}")
	public Instamart getMethodName(@PathVariable Long id) {
		return instamartService.getOrderById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable Long id)
	{
		instamartService.deleteById(id);
		return "Order Deleted Successfully";
	}
	
	
	
}
