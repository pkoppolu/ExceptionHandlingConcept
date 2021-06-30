package com.info.exceptions;
public class NullPointerExceptionExample {
public static void main(String[] args){
	String s1 = null;
	try {
		if(s1.equals("prudhvi")) {
			System.out.println("String is same");
		}
		else
			System.out.println("String is not same");
	}
	catch(NullPointerException npe) {
		System.out.println("NullPointerException caught");
	}
}
}
