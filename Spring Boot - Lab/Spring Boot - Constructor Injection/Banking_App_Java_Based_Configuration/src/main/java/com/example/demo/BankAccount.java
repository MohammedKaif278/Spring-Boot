package com.example.demo;

public class BankAccount {
	private int accountNumber;
	private String holderName,accountType;
	
	public BankAccount(int accountNumber, String holderName, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.accountType = accountType;
	}
	
	
	public void showAccount()
	{
		System.out.println("Account Number : "+accountNumber+"\nHolder Name : "+holderName+"\nAccount Type : "+accountType);
	}
	
}
