package com.coursemanagesystem.exceptions;


@SuppressWarnings("serial")
public class ResourceNotFoundException extends RuntimeException 
{
	
	String resourceName;
	String fieldName;
	int fieldValueid;
	
	

	public ResourceNotFoundException(String resourceName, String fieldName, int fieldValueid) 
	{
		super(String.format("%s not found with %s : %s", resourceName,fieldName,fieldValueid));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValueid = fieldValueid;
		
	}

	
}
