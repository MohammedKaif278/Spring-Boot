package com.lib.dao;

import com.lib.model.Book;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class BookCrudOperations {

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	//Add new Book
	public String addBook(Book book)
	{
		String sql="insert into Book values(:bookId,:title,:author,:category,:availableStatus)";
		Map<String,Object> map1=new HashMap<>();
		map1.put("bookId", book.getBookId());
		map1.put("title", book.getTitle());
		map1.put("author", book.getAuthor());
		map1.put("category", book.getCategory());
		map1.put("availableStatus",  book.getAvailableStatus());
		
		int rowCount = namedParameterJdbcTemplate.update(sql, map1);
		if(rowCount>0)
		{
			return "Data Inserted Successfully";
		}
		else
		{
			return "Data not Inserted";
		}
	}
	
	//Fetch by bookId
	public Book getBook(int bookId)
	{
		String sql="select * from Book where bookId=:bookId";
		
		Map<String , Object> map=new HashMap<>();
		map.put("bookId", bookId);
		
		return namedParameterJdbcTemplate.queryForObject(sql, map, new BeanPropertyRowMapper<>(Book.class));
		
	}
		
	//Fetch All Book
	public List<Book> getAllBooks()
	{
		String sql="select * from Book";
		return namedParameterJdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
	}
	
	
	//Update Availaability Status
	public String updateAvailability(int bookId,String status)
	{
		String sql="update Book set availableStatus=:status where bookId=:bookId";
		
		
		Map<String, Object> map=new HashMap<>();
		map.put("status", status);
		map.put("bookId", bookId);
		namedParameterJdbcTemplate.update(sql, map);
		return "Availability Status updated";
	}
	
	
	//Delete Book
	public String deleteBook(int bookId)
	{
		String sql="delete from Book where bookId=:bookId";
		
		Map<String , Object> map=new HashMap<>();
		map.put("bookId", bookId);
		namedParameterJdbcTemplate.update(sql, map);
		return "Book deleted";
	}
}
