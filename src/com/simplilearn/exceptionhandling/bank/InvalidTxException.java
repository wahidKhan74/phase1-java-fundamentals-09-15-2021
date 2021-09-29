package com.simplilearn.exceptionhandling.bank;

//checked exception
public class InvalidTxException extends Exception{

	String message;

	public InvalidTxException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "Invalid Tx Exception [message=" + message + "]";
	}
	
}
