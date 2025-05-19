package com.bank.customers;
public class Customer{
	private String customerName;
	private int customerId;
	public void setCustomerName(String customerName){
	this.customerName=customerName;
	}
	public String getCustomerName(){
	return customerName;
	}
	public void setCustomerId(int customerId){
	this.customerId=customerId;
	}
	public double getcustomerId(){
	return customerId;
	}
	
	public void showCustomerDetails(){
	System.out.println("Customer Name :" + customerName);
	System.out.println("Customer Id :"+customerId);	
	}
}
	