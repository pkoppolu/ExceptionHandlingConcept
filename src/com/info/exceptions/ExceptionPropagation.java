package com.info.exceptions;
// Exception first thrown in top of the stack and then it reaches to the bottom of the Stack until it is caught 
class ExceptionPropagation1 {	
 static void e1() {
		int a = 10/0; // It is unchecked exception because it is not showing any error even it has division by zero, it executes perfectly.
		System.out.println(a);
	}
	static void e2() {
		e1();
		System.out.println("'B' is called");
	}
	static void e3() {
		e2();
		System.out.println("'C' is called");
	}
}	
public class ExceptionPropagation {
	public static void main(String[] args) {
		try {
			ExceptionPropagation1.e3();
		}
		catch(ArithmeticException ae) {
			System.out.println();
		}
	}
}
