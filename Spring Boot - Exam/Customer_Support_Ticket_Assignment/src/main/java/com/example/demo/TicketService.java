package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TicketService {
	
	
	SupportAgentService supportAgentService;

	@Autowired
	public void setSupportAgentService(SupportAgentService supportAgentService) {
		this.supportAgentService = supportAgentService;
	}

	public void createTicket(String ticketId)
	{
		supportAgentService.assignAgent(ticketId);
		System.out.println("Ticket Created");
	}
}
