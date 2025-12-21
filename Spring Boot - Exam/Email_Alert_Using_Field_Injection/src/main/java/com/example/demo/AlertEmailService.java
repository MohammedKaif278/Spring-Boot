package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class AlertEmailService {
	public void sendAlert(String message)
	{
		System.out.println(message);
	}
}
