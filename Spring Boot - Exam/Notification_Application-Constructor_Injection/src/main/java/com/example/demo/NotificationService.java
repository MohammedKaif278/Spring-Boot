package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

	
	
	private Notification notification;
	
	@Autowired
	public NotificationService(@Qualifier("email") Notification notification) {
		super();
		this.notification = notification;
	}


	public void display(String msg)
	{
		notification.send(msg);
	}
}
