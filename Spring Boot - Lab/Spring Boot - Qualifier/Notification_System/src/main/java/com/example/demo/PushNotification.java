package com.example.demo;

public class PushNotification implements Notification{

	@Override
	public void send(String msg) {
		System.out.println("Notification System Initialized");
		System.out.println("Push Notification Selected");
		System.out.println("Sending Push Notification");
		System.out.println("Message: "+msg);
	}

}
