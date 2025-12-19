package com.example.demo;

import java.util.Date;

public class Product {
	private String productName,productCode,manufactureDate;
	private Date expiryDate;
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	
}
