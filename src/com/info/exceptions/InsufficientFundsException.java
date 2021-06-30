package com.info.exceptions;
public class InsufficientFundsException extends Exception{
String message;
InsufficientFundsException(){
	
}
InsufficientFundsException(String message){
	this.message = message;
}
public String getMessage() {
	return message;
}
}
