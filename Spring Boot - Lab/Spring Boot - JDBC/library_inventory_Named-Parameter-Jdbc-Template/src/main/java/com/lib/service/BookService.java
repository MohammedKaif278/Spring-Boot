package com.lib.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lib.dao.BookCrudOperations;
import com.lib.model.Book;

@Service
public class BookService {

	@Autowired
	private  BookCrudOperations bookCrudOperations;
	
	public String addBook(Book book)
	{
		return bookCrudOperations.addBook(book);
	}
	
	//Fetch by bookId
	public Book getBook(int bookId)
	{
		return bookCrudOperations.getBook(bookId);
	}
	
	
	//Fetch All Book
	public List<Book> getAllBooks()
	{
		return bookCrudOperations.getAllBooks();
	}
	
	
	//Update Availaability Status
	public String updateAvailability(int bookId,String status)
	{
		return bookCrudOperations.updateAvailability(bookId, status);
	}
	
	
	//Delete Book
		public String deleteBook(int bookId)
		{
			return bookCrudOperations.deleteBook(bookId);
		}
}
