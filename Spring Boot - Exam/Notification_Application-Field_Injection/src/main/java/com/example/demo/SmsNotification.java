package com.example.demo;

import org.springframework.stereotype.Component;

@Component("sms")
public class SmsNotification implements Notification {
	@Override
	public void send(String msg) {
		System.out.println("Notification send via Sms "+msg);
		
	}
}
