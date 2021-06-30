package com.info.exceptions;
import java.util.Scanner;
// Try-Catch block
public class Calculator {
static int x,y,sum, quotient, product;
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any two numbers: ");
	x = sc.nextInt();
	y = sc.nextInt();
	sum = x+y;
	System.out.println("Sum of two numbers = "+sum);
	try {
		quotient = x/y;
		System.out.println("Quotient of two numbers = "+quotient);
	}
	catch(ArithmeticException ae) {
		System.err.println("Second number should not be zero");
		System.err.println(ae.getMessage());
	}
	product = x*y;
	System.out.println("Product of two numbers = "+product);
	sc.close();
}
}
