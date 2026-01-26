package com.hospital.controller;

import java.net.HttpURLConnection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entity.Patient;
import com.hospital.response.APIResponse;
import com.hospital.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@PostMapping("/register")
	public ResponseEntity<APIResponse<Patient>> registerPatient(@RequestBody Patient patient) {
		Patient registerPatient = patientService.registerPatient(patient);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(new APIResponse<>(HttpURLConnection.HTTP_CREATED,HttpStatus.CREATED.name(), "Patient Register Successfully", registerPatient));
	}
	
	@GetMapping("/allPatients")
	public ResponseEntity<APIResponse<List<Patient>>> getAllPatients() {
		List<Patient> allPatient = patientService.getAllPatient();
		
		return ResponseEntity.status(HttpStatus.OK).body(new APIResponse<>(HttpURLConnection.HTTP_OK, HttpStatus.OK.name(), "All Patient Retrive", allPatient));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<APIResponse<Patient>> getMethodName(@PathVariable String patientName) {
		Patient patientById = patientService.getPatientById(patientName);
		
		return ResponseEntity.status(HttpStatus.OK).body(new APIResponse<>(HttpURLConnection.HTTP_OK, HttpStatus.OK.name(), "Patient Retrive by Id", patientById));
	}
	
	
	
}
