package com.hospital.service;

import java.util.List;


import com.hospital.entity.Patient;


public interface PatientService {

	Patient registerPatient(Patient patient);
	
	List<Patient> getAllPatient();
	
	Patient getPatientById(String patientId);
	
	Patient updatePatient(String patientId,Patient patient);
	
	void deletePatient(String patientId);
}
