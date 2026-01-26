package com.student.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentRepo;
import com.student.entity.StudentExam;
import com.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public String insertStudent(StudentExam studentExam) {
		studentRepo.save(studentExam);
		return  "Student inserted";
	}

	@Override
	public List<StudentExam> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public StudentExam updateStudent(StudentExam studentExam) {
		// TODO Auto-generated method stub
		return studentRepo.save(studentExam);
	}

	@Override
	public String deleteStudent(Long id) {
		studentRepo.deleteById(id);
		return "deleted";
	}
}
