package com.example.demo;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiscountCalculator {
	LocalDate currentDate;
	double price;
	
	public DiscountCalculator(LocalDate currentDate, double price) {
		super();
		this.currentDate = currentDate;
		this.price = price;
	}
	
	public double calculateDiscount()
	{
		DayOfWeek day=currentDate.getDayOfWeek();
		
		double discount;
		
		if(day==DayOfWeek.SATURDAY || day==DayOfWeek.SUNDAY)
		{
			discount=0.20;
		}
		else
		{
			discount=0.10;
		}
		
		
		return price-(price*discount);
	}
}
