package com.instamart.service;

import java.util.List;

import com.instamart.model.Instamart;

public interface InstamartService {
	
	void createOrder(Instamart instamart);
	
	 List<Instamart> getAllOrder();
	 
	 Instamart getOrderById(Long id);
	 
	 void deleteById(Long id);
}