package com.bank.accounts;
public class BankAccount{
	private String accountNumber;
	private double balance;
	public void setAccountNumber(String accountNumber){
	this.accountNumber=accountNumber;
	}
	public String getAccountNumber(){
	return accountNumber;
	}
	public void setBalance(double balance){
	this.balance=balance;
	}
	public double getBalance(){
	return balance;
	}
	
	public void showAccountDetails(){
	System.out.println("Account Number :" + accountNumber);
	System.out.println("Balance in Account :" + balance);
	}
}
	