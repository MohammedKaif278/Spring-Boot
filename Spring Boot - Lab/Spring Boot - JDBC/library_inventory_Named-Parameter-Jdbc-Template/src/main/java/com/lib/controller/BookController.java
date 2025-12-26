package com.lib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lib.model.Book;
import com.lib.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	//Add Book
	public String addBook(Book book)
	{
		return bookService.addBook(book);
	}
	
	//Fetch by bookId
	public Book getBook(int bookId)
	{
		return bookService.getBook(bookId);
	}
	
	//Fetch All Book
	public List<Book> getAllBooks()
	{
		return bookService.getAllBooks();
	}
	
	//Update Availaability Status
		public String updateAvailability(int bookId,String status)
		{
			return bookService.updateAvailability(bookId, status);
		}
		
		
	//Delete Book
		public String deleteBook(int bookId)
		{
			return bookService.deleteBook(bookId);
		}
}
