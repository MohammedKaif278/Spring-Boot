package com.example.demo;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotification implements Notification{

	@Override
	public void send(String msg) {
		System.out.println("Notification send via Email "+msg);
		
	}

}
