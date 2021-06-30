package com.info.exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator2 {
// Multiple catch blocks
	static int x,y,sum, quotient, product;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		try{
			x = sc.nextInt();
			y = sc.nextInt();
			sum = x+y;
		    System.out.println("Sum of two numbers = "+sum);
		    
		    quotient = x/y;
			System.out.println("Quotient of two numbers = "+quotient);
		}
		catch(InputMismatchException ime) { // Specific Handler
			System.err.println("Second number should not be an integer");
			System.err.println(ime.getMessage());
		}
		catch(ArithmeticException ae) { // Specific Handler
			System.err.println("Second number should not be zero");
			System.err.println(ae.getMessage());
		}
		// If there is any other exception if above two can't handle, then it goes to Generic Handler
		catch(Exception ex) { //Generic Handler
			ex.printStackTrace();
		}
		product = x*y;
		System.out.println("Product of two numbers = "+product);
		sc.close();
	}
}
