package com.university.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.university.model.CourseRegistration;

@Repository
public class UniversityDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//Insert 
	public void registerCourse(CourseRegistration cr)
	{
		String sql="insert into courseregistration values(?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql,cr.getRegistrationId(),cr.getStudentId(),cr.getStudentName(),cr.getCourseCode(),cr.getCourseName(),cr.getSemester(),cr.getCredits(),cr.getRegistrationStatus());
		
	}
	
	
	//Fetch All
	public List<CourseRegistration> getAllRegistration()
	{
		String sql="select * from courseregistration";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(CourseRegistration.class));
	}
	
	//Fetch by Id
	public CourseRegistration getRegistrations(int id)
	{
		String sql="select * from courseregistration where registrationId=?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(CourseRegistration.class),id);
		
	}
	
	
	//Update 
	public void updateStatus(int id,String status)
	{
		String sql="update courseregistration set registrationStatus=? where registrationId=?";
		jdbcTemplate.update(sql,status,id);
	}
	
	
	//already registered
	public boolean isAlreadyRegistered(int studentId,int courseCode)
	{
		String sql="select count(*) from courseregistration where studentId=? and courseCode=?";
		Integer count = jdbcTemplate.queryForObject(sql, Integer.class,studentId,courseCode);
		return count >0;
	}
	
	
	
	
}
