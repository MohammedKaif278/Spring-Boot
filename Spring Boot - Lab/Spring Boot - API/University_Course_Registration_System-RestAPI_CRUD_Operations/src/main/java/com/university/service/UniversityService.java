package com.university.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.university.controller.UniversityController;
import com.university.dao.UniversityDAO;
import com.university.exception.CustomException;
import com.university.model.CourseRegistration;

@Service
public class UniversityService {

    

	private static final int MAX_CREDITS = 24;
	@Autowired
	private UniversityDAO universityDAO;

    
	
	//Insert 
	public void registerCourse(CourseRegistration cr)
	{
		if(cr.getCredits()>MAX_CREDITS)
		{
			throw new CustomException("Credit limit Exceeded");
		}
		
		if(universityDAO.isAlreadyRegistered(cr.getStudentId(), cr.getCourseCode()))
		{
			throw new CustomException("Course Alreaady Registered");	
		}
		
		cr.setRegistrationStatus("REGISTERED");
		 universityDAO.registerCourse(cr);
	}
	
	
	//Fetch All
	public List<CourseRegistration> getAllRegistration(){
		return universityDAO.getAllRegistration();
	}
	
	//Fetch by Id
	public CourseRegistration getRegistration(int id)
	{
		return universityDAO.getRegistrations(id);
	}
	
	
	//Drop course
	public void dropCourse(int id)
	{
		if(LocalDate.now().getDayOfMonth()>30)
		{
			throw new CustomException("Course drop deadline passed");
		}
		
		universityDAO.updateStatus(id, "DROPPED");
	}
}
