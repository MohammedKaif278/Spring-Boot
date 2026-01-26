package com.hospital.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hospital.entity.Patient;

@Repository
public interface PatientRepo extends MongoRepository<Patient, String>{

}
