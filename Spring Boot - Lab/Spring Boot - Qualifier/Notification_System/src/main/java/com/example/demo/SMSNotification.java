package com.example.demo;

import org.springframework.stereotype.Component;

@Component("sms")
public class SMSNotification implements Notification{

	@Override
	public void send(String msg) {
		System.out.println("Notification System Initialized");
		System.out.println("SMS Notification Selected");
		System.out.println("Sending SMS Notification");
		System.out.println("Message: "+msg);
		
	}

}
