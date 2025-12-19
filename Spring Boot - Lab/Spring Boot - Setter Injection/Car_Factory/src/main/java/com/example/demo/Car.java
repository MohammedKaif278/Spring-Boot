package com.example.demo;

import java.time.LocalDateTime;

public class Car {
	private String name,number,dateOfManufacture;
	LocalDateTime dateOfBuying;

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getDateOfManufacture() {
		return dateOfManufacture;
	}


	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}


	public LocalDateTime getDateOfBuying() {
		return dateOfBuying;
	}


	public void setDateOfBuying(LocalDateTime dateOfBuying) {
		this.dateOfBuying = dateOfBuying;
	}


	@Override
	public String toString() {
		return "Car [name=" + name + ", number=" + number + ", dateOfManufacture=" + dateOfManufacture
				+ ", dateOfBuying=" + dateOfBuying + "]";
	}

	
	
}
