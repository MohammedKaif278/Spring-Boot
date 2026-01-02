package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
	
	@Autowired
	@Qualifier("email")
	private Notification notification; //Field Injection
	
	public void display()
	{
		notification.send("Your order has been shipped");
	}
}
