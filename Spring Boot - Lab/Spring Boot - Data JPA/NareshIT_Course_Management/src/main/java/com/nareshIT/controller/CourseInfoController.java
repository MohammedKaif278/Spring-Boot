package com.nareshIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nareshIT.model.CourseInfo;
import com.nareshIT.service.CourseInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/course")
public class CourseInfoController {

	@Autowired
	private CourseInfoService courseInfoService;
	
	@PostMapping("/createcourse")
	public String createCourse(@RequestBody CourseInfo courseInfo) {
		
		courseInfoService.createCourse(courseInfo);
		return "Course Created Successfully";
	}
	
	
	
}
