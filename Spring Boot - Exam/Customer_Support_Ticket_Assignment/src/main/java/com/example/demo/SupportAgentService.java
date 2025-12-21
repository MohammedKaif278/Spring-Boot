package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SupportAgentService {

	public void assignAgent(String ticketId)
	{
		System.out.println("Agent Assigned");
	}
}
