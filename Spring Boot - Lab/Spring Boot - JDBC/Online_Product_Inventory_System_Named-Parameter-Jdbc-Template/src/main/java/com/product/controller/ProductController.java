package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.product.dao.ProductRepository;
import com.product.model.Product;
import com.product.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	 ProductService productService;
	
	public String insertProduct(Product product)
	{
		return productService.insertProduct(product);
	}
}
