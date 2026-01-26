package com.bookstore.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entity.Book;
import com.bookstore.repo.BookStoreRepo;
import com.bookstore.service.BookStoreService;

@Service
public class BookStoreServiceImpl implements BookStoreService{

	@Autowired
	private BookStoreRepo bookStoreRepo;
	@Override
	public Book insertBook(Book book) {
		return bookStoreRepo.save(book);
		
	}

}
