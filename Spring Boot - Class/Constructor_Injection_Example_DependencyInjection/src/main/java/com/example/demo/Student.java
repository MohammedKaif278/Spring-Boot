package com.example.demo;

public class Student {
	//Inject The Book
	Book book;
	
	public Student(Book book)
	{
		this.book=book;
	}
	
	public void showData()
	{
		System.out.println("Constructor Injection");
	}
}
