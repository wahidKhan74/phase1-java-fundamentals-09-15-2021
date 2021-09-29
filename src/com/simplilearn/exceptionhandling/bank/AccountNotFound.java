package com.simplilearn.exceptionhandling.bank;

//unchecked exception
public class AccountNotFound extends RuntimeException{

	String message;
	
	AccountNotFound(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Account Not Found [message=" + message + "]";
	}
	
}
