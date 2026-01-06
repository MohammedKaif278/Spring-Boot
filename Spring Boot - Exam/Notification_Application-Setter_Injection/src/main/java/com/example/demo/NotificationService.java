package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

	
	private Notification notification;
	
	@Autowired
	@Qualifier("email")
	public void setNotification(Notification notification) {
		this.notification = notification;
	}


	public void display(String msg)
	{
		notification.send(msg);
	}
}
