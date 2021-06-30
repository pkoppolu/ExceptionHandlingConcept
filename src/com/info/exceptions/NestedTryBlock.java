package com.info.exceptions;
public class NestedTryBlock {
 public static void main(String[] args) {		
    try {
    	int a[] = {10,20,30,40,50};
    	try {
    		int b = a[3] / a[1]; 
    	}
    	catch(ArithmeticException ex) {
         System.out.println(ex);    	
         }
    	a[10] = 100;
    }
	catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println(ex);
	}
 }
}