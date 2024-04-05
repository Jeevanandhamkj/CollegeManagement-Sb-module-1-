package com.example.collegemanage.Exceptionhandle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jakarta.validation.ConstraintViolationException;

@RestControllerAdvice
public class ExceptionHandling {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String,String>Exceptionfun(MethodArgumentNotValidException exception){
		Map<String,String>errorMap=new HashMap<>();
		errorMap.put("error"," MethodArgumentNotValidException");
	    errorMap.put("message", "check your input field");
		return errorMap ;
		
	}
	@ExceptionHandler(UserAlreadyExistsException.class)
	public Map<String,String>exc(UserAlreadyExistsException exception){
		Map<String,String>error=new HashMap<>();
		error.put("error"," UserAlreadyExistsException");
	    error.put("message", "Create new Department");
	    return error;
	}
	@ExceptionHandler(ConstraintViolationException.class)
		public Map<String,String>excr(ConstraintViolationException exception){
			Map<String,String>error1=new HashMap<>();
			error1.put("error"," ConstraintViolationException");
		    error1.put("message", "give valid input");
		    return error1;
		
	}
	

}
