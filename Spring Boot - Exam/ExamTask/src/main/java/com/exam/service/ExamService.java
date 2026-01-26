package com.exam.service;

import java.util.List;

import com.exam.entity.Exam;


public interface ExamService {
	
	Exam AddExam(Exam exam);
	
	List<Exam> readExam();
	
	Exam updateExam(Long id,Exam exam);
	
	void deleteExam(Long id);
}
