package com.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.model.Order;
import com.order.service.OrderServiceImpl;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderServiceImpl orderServiceImpl;
	
	
	@PostMapping("/create")
	public Order createOrder(@RequestBody Order order)
	{
		
		return orderServiceImpl.createOrder(order);
	}
	
	@GetMapping("/{id}")
	public Order getOrderById(@PathVariable Integer id)
	{
		return orderServiceImpl.getOrderById(id);
	}
	
	@GetMapping("/all")
	
		public List<Order> getAllOrders()
		{
		return orderServiceImpl.getAllOrders();
		}
}
