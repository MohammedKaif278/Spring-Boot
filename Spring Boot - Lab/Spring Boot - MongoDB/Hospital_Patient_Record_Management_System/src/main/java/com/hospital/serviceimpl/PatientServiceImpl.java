package com.hospital.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.entity.Patient;
import com.hospital.repository.PatientRepo;
import com.hospital.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	private PatientRepo patientRepo;
	
	@Override
	public Patient registerPatient(Patient patient) {
		
		return patientRepo.save(patient);
	}

	@Override
	public List<Patient> getAllPatient() {
		
		return patientRepo.findAll();
	}

	@Override
	public Patient getPatientById(String patientId) {
		
		return patientRepo.findById(patientId).orElseThrow(()-> new RuntimeException("Patient not found with id"+patientId));
	}

	@Override
	public Patient updatePatient(String patientId, Patient patient) {
		Patient existing = patientRepo.findById(patientId).orElseThrow(()-> new RuntimeException("Patient not found with id"+patientId));
		existing.setPatientName(patient.getPatientName());
		existing.setAge(patient.getAge());
		existing.setGender(patient.getGender());
		existing.setDisease(patient.getDisease());
		existing.setDoctorAssigned(patient.getDoctorAssigned());
		
		return patientRepo.save(existing);
	}

	@Override
	public void deletePatient(String patientId) {
		patientRepo.deleteById(patientId);
		
	}

}
