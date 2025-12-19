package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Book book()
	{
		Book book = new Book();
		book.setBookId(101);
		book.setTitle("abc");
		book.setAuthor("Kaif");
		return book;
	}
	
	@Bean
	public BookViewer viewer()
	{
		BookViewer viewer = new BookViewer();
		viewer.setBook(book());
		return viewer;
	}
}
