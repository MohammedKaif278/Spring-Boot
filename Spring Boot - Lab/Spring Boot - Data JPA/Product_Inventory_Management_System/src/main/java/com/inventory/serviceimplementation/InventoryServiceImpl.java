package com.inventory.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.dao.InventoryRepo;

import com.inventory.model.Product;
import com.inventory.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService{

	@Autowired
	private InventoryRepo inventoryRepo;
	
	@Override
	public void addProduct(Product product) {
		
		inventoryRepo.save(product);
		
	}

	@Override
	public void addAllProduct(List<Product> product) {
		inventoryRepo.saveAll(product);
		
	}	

	@Override
	public Product getProductById(Long id) {
		return inventoryRepo.findById(id).get();
	}

}
