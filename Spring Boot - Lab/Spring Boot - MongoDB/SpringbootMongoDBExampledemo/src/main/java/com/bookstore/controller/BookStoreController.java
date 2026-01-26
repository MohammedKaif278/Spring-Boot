package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.entity.Book;
import com.bookstore.service.BookStoreService;


@RestController
@RequestMapping("/book")
public class BookStoreController {

	@Autowired
	private BookStoreService bookStoreService;
	
	@PostMapping("/insert")
	public Book insertBook(@RequestBody Book book) {
		
		
		return bookStoreService.insertBook(book);
	}
	
}
