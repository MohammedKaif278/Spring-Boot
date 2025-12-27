package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
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
	
	//Update Student
	public String updateStudent(int marks,int id)
	{
		String sql="update student set marks=? where id=?";
		jdbcTemplate.update(sql,marks,id);
		return "Student Data Updated";
	}
	
	//Delete Student
	public String deleteStudent(int id)
	{
		String sql="delete from student where id=?";
		jdbcTemplate.update(sql,id);
		return "Student Deleted";
		
	}
	
	//Fetch Student by Id
	public Student getStudent(int id)
	{
		String sql="select * from student where id=?";
		Student student = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Student.class),id);
		return student;
	}
	
	//Fetch All Student
	public List<Student> getAllStudents()
	{
		String sql="select * from Student";
		List<Student> student=jdbcTemplate.query(sql, new BeanPropertyRowMapper(Student.class));
		 return student;
	}
}
