package com.inventory.service;

import java.util.List;

import com.inventory.model.Product;

public interface InventoryService {

	void addProduct(Product product);

	void addAllProduct(List<Product> product);

	Product getProductById(Long id);

}
