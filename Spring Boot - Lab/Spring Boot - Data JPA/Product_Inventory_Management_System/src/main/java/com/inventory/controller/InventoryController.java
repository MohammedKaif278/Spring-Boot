package com.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.model.Product;
import com.inventory.service.InventoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/inventory")
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody Product product) {
		
		inventoryService.addProduct(product);
		
		return "Product Added to Innventory";
	}
	
	
	@PostMapping("/addAllProduct")
	public String addAllProduct(@RequestBody List<Product> product) {
		//TODO: process POST request
		
		inventoryService.addAllProduct(product);
		return "All Product Added to Innventory";
	}
	
	
	@GetMapping("/getProductById/{id}")
	public Product getMethodName(@PathVariable Long id) {
		return inventoryService.getProductById(id);
	}
	
	
	
}
