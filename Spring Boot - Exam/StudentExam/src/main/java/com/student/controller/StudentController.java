package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.StudentExam;
import com.student.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/insertstudent")
	public String insertStudent(@RequestBody StudentExam studentExam) {
		
		
		return studentService.insertStudent(studentExam);
	}
	
	
	@GetMapping("/getallstudent")
	public List<StudentExam> getStudent() {
		return studentService.getAllStudent();
	}
	
	@PutMapping("/update")
	public StudentExam uppdateStudent(@RequestBody StudentExam studentExam) {
		//TODO: process PUT request
		
		return studentService.updateStudent(studentExam);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable Long id)
	{
		return studentService.deleteStudent(id);
	}
	
}
