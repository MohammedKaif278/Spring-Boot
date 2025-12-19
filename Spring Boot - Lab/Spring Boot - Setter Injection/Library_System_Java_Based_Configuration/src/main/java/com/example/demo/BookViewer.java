package com.example.demo;

public class BookViewer {
	
	Book book;

	public void setBook(Book book) {
		this.book = book;
	}
	
	public void display()
	{
		book.showBook();
	}
}
