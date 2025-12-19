package com.example.demo;

public class Product {
	private int productId;
	private String name,brand;
	
	public Product(int productId, String name, String brand) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
	}
	 
	public void displayProduct()
	{
		System.out.println("Product Id : "+productId+"\nName : "+name+"\nBrand : "+brand);
	}
	
}
