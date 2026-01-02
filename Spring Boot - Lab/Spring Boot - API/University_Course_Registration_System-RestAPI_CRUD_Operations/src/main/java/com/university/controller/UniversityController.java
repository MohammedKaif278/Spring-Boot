package com.university.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.model.CourseRegistration;
import com.university.service.UniversityService;

@CrossOrigin(origins = "http://127.0.0.1:5501/")
@RestController
@RequestMapping("/courseregistration")
public class UniversityController {

	@Autowired
	private UniversityService universityService;
	
	//Insert
	@PostMapping("/register")
	public String courseRegistration(@RequestBody CourseRegistration cr)
	{
		universityService.registerCourse(cr);
		return "Course Registered Successfully";
	}
	
	
	//Fetch All
	@GetMapping("/registrations")
	public List<CourseRegistration> getAllRegistration()
	{
		return universityService.getAllRegistration();
	}
	
	
	
	//Fetch by ID
	@GetMapping("/registrations/{id}")
	public CourseRegistration getRegistration(@PathVariable int id)
	{
		return universityService.getRegistration(id);
	}
	
	
	//Drop Course
	@PutMapping("/drop/{id}")
	public String dropCourse(@PathVariable int id)
	{
		universityService.dropCourse(id);
		return "Course Dropped Successfully";
	}
}
