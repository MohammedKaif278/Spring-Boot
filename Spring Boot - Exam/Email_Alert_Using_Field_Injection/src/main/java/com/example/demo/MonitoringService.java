package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MonitoringService {

	@Autowired
	AlertEmailService alertEmailService;
	
	public void monitor() 
	{
	alertEmailService.sendAlert("Failure is Occured");	
	
	}
}
