package com.info.exceptions;
// Using Throw and Throws Exception
public class Account {
int acno;
String name;
double balance;
Account(int acno, String name){
	this.acno = acno;
	this.balance = 20000;
	this.name = name;
}
public void withdraw(double amount) throws InsufficientFundsException{
	if((balance - amount) < 5000) {
		// Needs to create an custom exception object
		InsufficientFundsException isf = new InsufficientFundsException("Low Balance");
		throw isf;
	}
	else
	{
		balance = balance - amount;
	}
}
	public void print() {
		System.out.println("Account Number: "+acno);
		System.out.println("Account Name: "+name);
		System.out.println("Account Balance: "+balance);
	}
}

