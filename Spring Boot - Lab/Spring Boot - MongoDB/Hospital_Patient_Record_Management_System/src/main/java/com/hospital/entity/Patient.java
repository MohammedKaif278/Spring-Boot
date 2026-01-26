package com.hospital.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "patients")
public class Patient {

	@Id
	private String patientId;
	private String patientName;
	private int age;
	private String gender;
	private String disease;
	private String doctorAssigned;
	
	private LocalDate admissionDate;
}
