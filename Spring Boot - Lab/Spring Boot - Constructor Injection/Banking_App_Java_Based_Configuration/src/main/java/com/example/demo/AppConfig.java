package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public BankAccount getBankAccount()
	{
		return new BankAccount(123456, "Mohammed Kaif", "Saving Account");
		
	}
	
	@Bean
	public AccountViewer getAccountViewer()
	{
		return new AccountViewer(getBankAccount());
	}
}
