package com.example.demo;

import java.time.LocalDateTime;

public class WishMessageGenerator {
	 LocalDateTime currentDateTime;
	 
	public WishMessageGenerator(LocalDateTime currentDateTime) {
		super();
		this.currentDateTime=currentDateTime;
	}
	
	public String generateWishMessage()
	{
		int hour=currentDateTime.getHour();
		if(hour<12)
		{
			return "Good Morning";
		}
		else if(hour>=12 || hour<18)
		{
			return "Good Afternoon";
		}
		else 
		{
			return "Good Evening";
		}
		
	}
}
