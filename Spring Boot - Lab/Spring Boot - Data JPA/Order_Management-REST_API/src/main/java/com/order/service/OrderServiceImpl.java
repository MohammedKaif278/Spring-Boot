package com.order.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.dao.OrderRepository;
import com.order.model.Order;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public Order createOrder(Order order) {
		
		return orderRepository.save(order);
	}

	@Override
	public Order getOrderById(Integer id) {
		return orderRepository.findById(id).get();
	}

	@Override
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

}
