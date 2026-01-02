package com.university.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseRegistration {
	private int registrationId,studentId;
	private String studentName;
	private int courseCode;
	private String courseName;
	private int semester;
	private int credits;
	private String registrationStatus;
	
	
}
