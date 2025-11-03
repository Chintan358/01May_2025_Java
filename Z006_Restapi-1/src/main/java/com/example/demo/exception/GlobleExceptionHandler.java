package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.dto.APIResponse;

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
	
	
	
}
