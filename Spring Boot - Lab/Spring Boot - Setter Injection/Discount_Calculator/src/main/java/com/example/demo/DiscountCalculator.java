package com.example.demo;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiscountCalculator 
{
	private LocalDate currentDate;
	private double price;
	
	public void setCurrentDate(LocalDate currentDate) {
		this.currentDate = currentDate;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double calculateDiscount()
	{
		String day=currentDate.getDayOfWeek().toString();
		
		double discountPrice;
		
		if(day.equals("SATURDAY")  || day.equals("SUNDAY"))
		{
			discountPrice=0.20;
		}
		else
		{
			discountPrice=0.10;
		}
		return price-(price*discountPrice);
	}
	
	
}
