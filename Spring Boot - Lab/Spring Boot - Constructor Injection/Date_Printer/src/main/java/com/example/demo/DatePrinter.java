package com.example.demo;

import java.time.LocalDate;

public class DatePrinter {
	LocalDate currentDate;

	public DatePrinter(LocalDate currentDate) {
		super();
		this.currentDate = currentDate;
	}
	
	public void printDate()
	{
		System.out.println("Current Date : "+currentDate);
	}
}
