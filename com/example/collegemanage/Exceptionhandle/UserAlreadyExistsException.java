package com.example.collegemanage.Exceptionhandle;

public class UserAlreadyExistsException extends RuntimeException {
	public UserAlreadyExistsException(String s) {
		super(s);
		
	}

}
