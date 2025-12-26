package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class StudentOperations {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	//Create Table
	public String createTable()
	{
		String create="create table Student(id number(5),name varchar2(20),marks number(3))";
		jdbcTemplate.execute(create);
		return "Table Created with table name : Student";
	}
	
	//Add Studnet
	public String addStudnet(Student s)
	{
		String add="insert into student values(?,?,?)";
		jdbcTemplate.update(add,s.getId(),s.getName(),s.getMarks());
		return "Student record are Inserted";
	}
}
