package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	
	@Autowired
	@Qualifier("pdf")
	private ReportGenerator reportGenerator;
	
	public void display(String data)
	{
		reportGenerator.generateReport(data);
	}
}
