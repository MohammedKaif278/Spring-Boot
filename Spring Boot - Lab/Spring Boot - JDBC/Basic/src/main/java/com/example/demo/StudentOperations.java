package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

import javax.sql.DataSource;

@Component
public class StudentOperations {

    private final DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;

    StudentOperations(DataSource dataSource) {
        this.dataSource = dataSource;
    }
	
	//Insert
	public void addStudent(Student s)
	{
		String sql1="insert into Student values(?,?,?)";
		jdbcTemplate.update(sql1,s.getId(),s.getName(),s.getMarks());
		System.out.println("Student Inserted");
	}
	
	//Update 
	public void updateStudent(Student s)
	{
		String sql2="update Student set name=? ,marks=? where id=? ";
		jdbcTemplate.update(sql2,s.getName(),s.getMarks(),s.getId());
		System.out.println("Data Updated");
	}
	
	//delete 
	public void deleteStudent(int id)
	{
		String sql3="delete from student where id=?";
		jdbcTemplate.update(sql3,id);
		System.out.println("Data Deleted");
	}
	
	//Retrive - one 
	public Student getStudent(int marks)
	{
		String sql4="select * from Student where marks=?";
		return jdbcTemplate.queryForObject(sql4,new BeanPropertyRowMapper<>(Student.class),marks);
	}
	
	//Retrive - All
	public List<Student> getAllStudents()
	{
		String sql5="select * from Student";
		return jdbcTemplate.query(sql5, new BeanPropertyRowMapper<>(Student.class));
	}
}
