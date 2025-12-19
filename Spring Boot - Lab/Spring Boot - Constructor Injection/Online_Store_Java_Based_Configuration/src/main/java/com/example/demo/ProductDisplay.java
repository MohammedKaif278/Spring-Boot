package com.example.demo;

public class ProductDisplay {

	Product product;

	public ProductDisplay(Product product) {
		super();
		this.product = product;
	}
	
	public void show()
	{
		product.displayProduct();
	}
}
