package com.info.exceptions;
public class IsfDemo {
public static void main(String[] args) {
	Account ac = new Account(53465, "Prudhvi");
	try{
		ac.withdraw(18000);
	}
	catch(InsufficientFundsException isf) {
		System.err.println(isf.getMessage());
	}
}
}
