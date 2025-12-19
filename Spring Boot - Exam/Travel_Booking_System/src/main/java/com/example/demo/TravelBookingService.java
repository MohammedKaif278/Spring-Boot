package com.example.demo;

import java.util.List;

public class TravelBookingService {
	private int bookingId;
	private String customerName;
	private List<String> destinations;
	
	
	public TravelBookingService(int bookingId, String customerName, List<String> destinations) {
		super();
		this.bookingId = bookingId;
		this.customerName = customerName;
		this.destinations = destinations;
	}


	@Override
	public String toString() {
		return "TravelBookingService [bookingId=" + bookingId + ", customerName=" + customerName + ", destinations="
				+ destinations + "]";
	}
	
	
}
