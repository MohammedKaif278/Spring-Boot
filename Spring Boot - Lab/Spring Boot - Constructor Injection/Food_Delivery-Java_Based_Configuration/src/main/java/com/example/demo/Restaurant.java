package com.example.demo;

public class Restaurant {
	private int restaurantId;
	private String name,cuisine;
	private double rating;
	private int totalReviews;
	
	public Restaurant(int restaurantId, String name, String cuisine, double rating, int totalReviews) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.cuisine = cuisine;
		this.rating = rating;
		this.totalReviews = totalReviews;
	}
	
	public void showData()
	{
		System.out.println("restaurantId : "+restaurantId);
		System.out.println("name : "+name);
		System.out.println("cuisine : "+cuisine);
		System.out.println("rating : "+rating);
		System.out.println("totalReviews : "+totalReviews);
	}
	
	public String analyzeRating()
	{
		
		String msg;
		if(rating>=4.5 && totalReviews>500)
		{
			msg="Top Rated";
		}
		else if(rating>=4)
		{
			msg="Excellent Choice";
		}
		
		else 
		{
			msg="Poor Quality";
		}
		return "Category : "+msg+"\nRecommendation: Highly recommended for family dining!";
	}
	
	
}
