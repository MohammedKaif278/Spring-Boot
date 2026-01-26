package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.dao.StudentRepo;
import com.student.entity.StudentExam;

public interface StudentService {

	String insertStudent(StudentExam studentExam);

	List<StudentExam> getAllStudent();

	StudentExam updateStudent(StudentExam studentExam);

	String deleteStudent(Long id);

	
	
}
