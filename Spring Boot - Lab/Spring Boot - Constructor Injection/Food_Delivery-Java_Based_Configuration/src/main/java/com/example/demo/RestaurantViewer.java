package com.example.demo;

public class RestaurantViewer {
	Restaurant restaurant;

	public RestaurantViewer(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}
	
	public void viewInfo()
	{
		restaurant.showData();
		System.out.println(restaurant.analyzeRating());
	}
}
