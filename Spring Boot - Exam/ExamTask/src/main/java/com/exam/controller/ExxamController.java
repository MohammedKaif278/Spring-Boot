package com.exam.controller;

import java.net.HttpURLConnection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.entity.Exam;
import com.exam.response.APIResponse;
import com.exam.service.ExamService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/exam")
public class ExxamController {

	@Autowired
	private ExamService examService;
	
	@PostMapping("/add")
	public ResponseEntity<APIResponse<Exam>> addExam(@RequestBody Exam exam) {
		Exam addExam = examService.AddExam(exam);
		
		
		return ResponseEntity.status(HttpURLConnection.HTTP_CREATED).body(new APIResponse<>(HttpStatus.CREATED.value(), HttpStatus.CREATED.name(), "Exam Inserted Successfully", addExam));
	}
	
	@GetMapping("/AllExams")
	public ResponseEntity<APIResponse<List<Exam>>> getAllExams() {
		List<Exam> exam = examService.readExam();
		
		return ResponseEntity.status(HttpURLConnection.HTTP_OK).body(new APIResponse<>(HttpStatus.OK.value(), HttpStatus.OK.name(), "All Exams Retrive", exam));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<APIResponse<Exam>> updateExam(@PathVariable Long id, @RequestBody Exam exam) {
		Exam updateExam = examService.updateExam(id, exam);
		
		
		return ResponseEntity.status(HttpURLConnection.HTTP_OK).body(new APIResponse<>(HttpStatus.OK.value(), HttpStatus.OK.name(), " Exams Update Successfully", exam));
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<APIResponse<Exam>> deleteExam(@PathVariable Long id)
	{
		 examService.deleteExam(id);
		 return ResponseEntity.status(HttpURLConnection.HTTP_OK).body(new APIResponse<>(HttpStatus.OK.value(), HttpStatus.OK.name(), " Exams Deleted Successfully", null));
		 
	}
	
	
}
