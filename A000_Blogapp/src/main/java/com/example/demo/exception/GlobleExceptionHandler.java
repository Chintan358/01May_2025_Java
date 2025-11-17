package com.example.demo.exception;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;





@RestControllerAdvice
public class GlobleExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<APIResponse> HandleResourceNotfoundException(ResourceNotFoundException e)
	{
		APIResponse api = new APIResponse();
		api.setMessage(e.getMessage());
		api.setSuccess("False");
		
		return new ResponseEntity<>(api,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> HandleMEthodArgumentException(MethodArgumentNotValidException e)
	{
			
		Map<String, String> map = new HashMap<>();
		e.getBindingResult().getFieldErrors().forEach((err)->{
			
			map.put(err.getField(), err.getDefaultMessage());	
		});;
		
		return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
	}
	
	
	
	
}
