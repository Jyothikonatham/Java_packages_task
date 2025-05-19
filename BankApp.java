package com.bank.app;
import com.bank.accounts.BankAccount;
import com.bank.customers.Customer;
public class BankApp{
	public static void main(String[] args){

	BankAccount b1 = new BankAccount();
	b1.setAccountNumber("372841694713");
	b1.setBalance(1000000);

	Customer c1 = new Customer();
	c1.setCustomerName("Karthik");
	c1.setCustomerId(3445);
	
	b1.showAccountDetails();
	System.out.println();
	c1.showCustomerDetails();
	}
}
	