package com.nareshit;

interface Engines
{
	void start();
}

class PetrolEngine implements Engines
{
	public void start()
	{
		System.out.println("This is PetrolEngine");
	}
}

class DieselEngine implements Engines
{
	public void start()
	{
		System.out.println("This is DieselEngine");
	}
}

class ElectricEngine implements Engines
{
	public void start()
	{
		System.out.println("This is ElectricEngine");
	}
}

class Cars
{
	Engines egg;
	public Cars(Engines egg)
	{
		this.egg=egg;
	}
	
	public void drive()
	{
		egg.start();
		System.out.println("Drive the Car");
	}
}

public class LooslyCoupling {
	public static void main(String[] args) {
		ElectricEngine ecc=new ElectricEngine();
		Cars cc=new Cars(ecc);
		cc.drive();
	}
}
