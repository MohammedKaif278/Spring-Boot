package com.lib.model;

import org.springframework.stereotype.Component;

@Component
public class Book {
	private int bookId;
	private String title,author,category,availableStatus;
	
	public Book() {
		
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAvailableStatus() {
		return availableStatus;
	}
	public void setAvailableStatus(String availableStatus) {
		this.availableStatus = availableStatus;
	}
	public Book(int bookId, String title, String author, String category, String availableStatus) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.category = category;
		this.availableStatus = availableStatus;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", availableStatus=" + availableStatus + "]";
	}
	 
	
	
}
