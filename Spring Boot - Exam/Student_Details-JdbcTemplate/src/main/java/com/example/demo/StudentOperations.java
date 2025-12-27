package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class StudentOperations {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public String insertStudnet(StudentDetails s)
	{
		String sql="insert into studentdetails values(?,?,?)";
		jdbcTemplate.update(sql,s.getStudentId(),s.getStudentName(),s.getStudentEmail());
		return "Student Data inserted";
	}
	
	public String updateEmail(String Email,int Id)
	{
		String sql="update studentdetails set studentEmail=? where studentId=?";
		jdbcTemplate.update(sql,Email,Id);
		return "Student Email Update";
	}
	
	
	public List<StudentDetails> getAllStudent()
	{
		String sql="select * from studentdetails";
		
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(StudentDetails.class));
	}
	
	
	public String deleteStudent(int Id)
	{
		String sql="delete from studentdetails where studentId=?";
		jdbcTemplate.update(sql,Id);
		return "Student Deleted";
	}
}
