package com.example.demo;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotification implements Notification{

	@Override
	public void notification(String msg) {
		System.out.println("Notification System Initialized");
		System.out.println("Email Notification Selected");
		System.out.println("Sending Email Notification");
		System.out.println("Message: "+msg);
	}

}
