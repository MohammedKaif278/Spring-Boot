package com.example.demo;

public class Factory {
	String address;
	Car car;
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Factory [address=" + address + ", car=" + car + "]";
	}
	
	
}
