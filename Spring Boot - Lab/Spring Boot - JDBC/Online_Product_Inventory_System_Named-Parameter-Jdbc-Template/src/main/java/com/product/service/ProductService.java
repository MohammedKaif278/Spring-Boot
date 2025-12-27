package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.ProductRepository;
import com.product.model.Product;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public String insertProduct(Product product)
	{
		return productRepository.insertProduct(product);
	}
}
