package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class InventoryService {
	public void updateStock(String productId, int quantity)
	{
		System.out.println("Stocket is Updated");
	}
}
