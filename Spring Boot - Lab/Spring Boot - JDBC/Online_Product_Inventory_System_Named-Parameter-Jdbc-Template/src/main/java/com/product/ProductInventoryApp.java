package com.product;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.product.config.jdbcConfig;
import com.product.controller.ProductController;
import com.product.model.Product;

public class ProductInventoryApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(jdbcConfig.class);
		ProductController productController = con.getBean(ProductController.class);
		System.out.println(productController.insertProduct(new Product(1,"iphone 17","Apple",150000.0,"Available")));
	}
}
