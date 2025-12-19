package com.example.demo;

public class LoanApplicant {
	private int applicantId;
	private String name;
	private int creditScore;
	private double annualIncome;
	private double requestedLoanAmount;
	private int loanTenureYears;
	
	
	public LoanApplicant(int applicantId, String name, int creditScore, double annualIncome, double requestedLoanAmount,
			int loanTenureYears) {
		super();
		this.applicantId = applicantId;
		this.name = name;
		this.creditScore = creditScore;
		this.annualIncome = annualIncome;
		this.requestedLoanAmount = requestedLoanAmount;
		this.loanTenureYears = loanTenureYears;
	}
	
	
}
