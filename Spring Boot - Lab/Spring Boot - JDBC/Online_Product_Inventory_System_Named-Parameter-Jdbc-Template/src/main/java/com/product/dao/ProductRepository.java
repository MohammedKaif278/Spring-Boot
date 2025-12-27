package com.product.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.product.model.Product;

@Repository
public class ProductRepository {
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	//Insert Product 
	public String insertProduct(Product product)
	{
		String sql="insert into product values(:productId,:productName,:brand,:price,:stockQuantity)";
		Map<String , Object> map=new HashMap<>();
		map.put("productId", product.getProductId());
		map.put("productName", product.getProductName());
		map.put("brand", product.getBrand());
		map.put("price", product.getPrice());
		map.put("stockQuantity", product.getStockQuantity());
		
	
		int resultSet = namedParameterJdbcTemplate.update(sql, map);
		
		if(resultSet>0)
		{
			return "Data Inserted Successfully";
		}
		else
		{
			return "Data Not Inserted";
		}
	}
}
