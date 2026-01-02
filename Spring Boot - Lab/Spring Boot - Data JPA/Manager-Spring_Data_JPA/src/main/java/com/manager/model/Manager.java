package com.manager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "manager")
public class Manager {

	@Id
	private Integer mId;
	private String mName;
	private double mSalary;
	private String mDept;
	
	
	
}
