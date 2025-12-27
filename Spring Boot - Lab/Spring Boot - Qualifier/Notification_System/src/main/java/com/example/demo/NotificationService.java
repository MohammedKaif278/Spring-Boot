package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
	
	@Autowired
	@Qualifier("email")
	Notification notification;
	
	public void display()
	{
		notification.notification("Your order has been shipped");
	}
}
