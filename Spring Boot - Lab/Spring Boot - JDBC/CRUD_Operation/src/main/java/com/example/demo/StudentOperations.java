package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentOperations {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public String createTable()
	{
		String create="create table Student(id number(5),name varchar2(20),marks number(3))";
		jdbcTemplate.execute(create);
		return "Table Created with table name : Student";
	}
	
	
}
