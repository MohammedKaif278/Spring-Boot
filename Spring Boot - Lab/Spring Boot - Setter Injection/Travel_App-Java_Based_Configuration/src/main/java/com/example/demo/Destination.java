package com.example.demo;

public class Destination {
	private int destinationId;
	private String name,country;
	
	public void setDestinationId(int destinationId) {
		this.destinationId = destinationId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void displayDestination()
	{
		System.out.println("destinationId : "+destinationId);
		System.out.println("name : "+name);
		System.out.println("country : "+country);
	}
}
