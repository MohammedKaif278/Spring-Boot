package com.lib;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lib.config.JdbcConfig;
import com.lib.controller.BookController;
import com.lib.dao.BookCrudOperations;
import com.lib.model.Book;


public class LibraryApp {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(JdbcConfig.class);
		 BookController bookController = con.getBean(BookController.class);
		 
		 //Add Book
		//System.out.println(bookController.addBook(new Book(1,"Spring Core","Rod Johnson","Programming","Available")));
//		 System.out.println(bookController.addBook(new Book(2, "Java Basics", "James Gosling", "Programming", "Available")));

		 
		//fetch book by bookId
		//System.out.println(bookController.getBook(1));
		
		 
		//Fetch All Book
		List<Book> books=bookController.getAllBooks();
		System.out.println("All Book Details : ");
		for(Book b:books)
		{
			System.out.println(b);
		}
		 
		 
		 //Update availaability
		 //System.out.println(bookController.updateAvailability(1, "Not Available"));
		
		
		 //Delete Book
		 //System.out.println(bookController.deleteBook(1));
		
	}
}
