package com.example.demo;

import java.util.Map;

public class OrderService {
	private int orderId;
	private String customerName;
	
	Map<String ,Integer> items;

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setItems(Map<String, Integer> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "OrderService [orderId=" + orderId + ", customerName=" + customerName + ", items=" + items + "]";
	}
	
}
