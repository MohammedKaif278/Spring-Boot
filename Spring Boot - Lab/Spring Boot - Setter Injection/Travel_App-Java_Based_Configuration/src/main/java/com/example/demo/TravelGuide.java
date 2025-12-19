package com.example.demo;

public class TravelGuide {
	Destination destination;

	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	
	public void guide()
	{
		destination.displayDestination();
	}
}
