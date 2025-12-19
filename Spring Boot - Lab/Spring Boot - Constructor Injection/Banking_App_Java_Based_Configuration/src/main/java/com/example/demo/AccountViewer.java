package com.example.demo;

public class AccountViewer {

	BankAccount bankAccount;

	public AccountViewer(BankAccount bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}
	
	
	public void view()
	{
		bankAccount.showAccount();
	}
	
}
