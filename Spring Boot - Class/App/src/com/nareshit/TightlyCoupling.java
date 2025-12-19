package com.nareshit;

class Engine
{
	void start()
	{
		System.out.println("Start the Engine");
	}
}

class Car
{
	//Engine eg=new Engine();
	public void drive()
	{
		eg.start();
		System.out.println("Drive the Car...");
	}
}

public class TightlyCoupling {
	public static void main(String[] args) {
		Car c=new Car();
		c.drive();
	}
}
