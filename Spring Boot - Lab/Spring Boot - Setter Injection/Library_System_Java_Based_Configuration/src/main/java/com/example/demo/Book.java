package com.example.demo;

public class Book {
	private int bookId;
	private String title,author;
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	public void showBook(){
		System.out.println("Book Id : "+bookId);
		System.out.println("title : "+title);
		System.out.println("author : "+author);
	}
}
