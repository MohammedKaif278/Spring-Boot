package com.exam.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entity.Exam;
import com.exam.repository.ExamRepo;
import com.exam.service.ExamService;

@Service
public class ExamServiceImpl implements ExamService{

	@Autowired
	private ExamRepo examRepo;
	@Override
	public Exam AddExam(Exam exam) {
		return examRepo.save(exam);
		
		 
	}

	@Override
	public List<Exam> readExam() {
		
		return examRepo.findAll();
	}

	@Override
	public Exam updateExam(Long id, Exam exam) {
		Exam byId = examRepo.findById(id).orElseThrow(()-> new RuntimeException("Exam is not avaailable fr this id"+id));
	     byId.setExamName(exam.getExamName());
	     byId.setStudentName(exam.getStudentName());
	     byId.setTopicName(exam.getTopicName());
	     
		return examRepo.save(byId);
	}

	@Override
	public void deleteExam(Long id) {
		Exam byId = examRepo.findById(id).orElseThrow(()-> new RuntimeException("Exam is not avaailable fr this id"+id));
		 examRepo.delete(byId);
		
	}

}
