package com.example.demo;

public class Student {
	
	//Inject the Book 
	Book book;
	
	// create the setter methods
	public void setBook(Book book)
	{
		this.book=book;
	}
	
	// call the getBookName // it is optional
	public void showDetails()
	{
		System.out.println(book.getBookName());
	}
}

