package com.info.exceptions;
public class FinallyBlock {
public static void main(String[] args) {
	int a[] = new int[5];
	int i;
	try {
		System.out.println("a[8] = "+a[8]);
	}
	catch(Exception ex) {
		System.err.println("ArrayIndexOutOfBounds Exception will be raised");
		System.err.println(ex.getMessage()+"\n");
	}
	finally {
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		for( i=0; i<a.length-1; i++) {
			System.out.println(a[i]);
		}
		System.out.println("End of program");
	}
}
}
