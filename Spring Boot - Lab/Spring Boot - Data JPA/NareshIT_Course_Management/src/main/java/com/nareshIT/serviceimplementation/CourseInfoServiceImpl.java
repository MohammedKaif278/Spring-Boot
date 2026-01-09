package com.nareshIT.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshIT.dao.CourseInfoRepo;
import com.nareshIT.model.CourseInfo;
import com.nareshIT.service.CourseInfoService;

@Service
public class CourseInfoServiceImpl implements CourseInfoService {

	@Autowired
	private CourseInfoRepo courseInfoRepo;
	@Override
	public void createCourse(CourseInfo courseInfo) {
		courseInfoRepo.save(courseInfo);
		
	}

}
