package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

	@Autowired
	@Qualifier("email")
	private Notification notification;
	
	public void display(String msg)
	{
		notification.send(msg);
	}
}
