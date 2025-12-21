package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalesService {

	@Autowired
	InventoryService inventoryService;
	
	public void sellProduct(String productId, int quantity)
	{
		inventoryService.updateStock(productId, quantity);
		System.out.println("Product Will be Sell");
	}
}
