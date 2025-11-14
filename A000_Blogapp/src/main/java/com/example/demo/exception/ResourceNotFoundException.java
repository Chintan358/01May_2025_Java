package com.example.demo.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	String resourceName;
	String fieldName;
	int id;
	public ResourceNotFoundException(String resourceName, String fieldName, int id)
	{
		super(resourceName+" with "+fieldName+" : "+id+" is not found");
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.id = id;	
		
	}
}
