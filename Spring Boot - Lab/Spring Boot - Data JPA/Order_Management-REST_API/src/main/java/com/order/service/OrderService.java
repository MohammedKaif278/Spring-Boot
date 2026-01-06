package com.order.service;

import java.util.List;

import com.order.model.Order;

public interface OrderService {
	Order createOrder(Order order);
	
	Order getOrderById(Integer id);
	
	List<Order> getAllOrders();
}
