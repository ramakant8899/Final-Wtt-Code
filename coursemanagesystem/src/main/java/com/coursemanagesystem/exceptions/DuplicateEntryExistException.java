	package com.coursemanagesystem.exceptions;
	
	@SuppressWarnings("serial")
	public class DuplicateEntryExistException extends IllegalArgumentException 
	{
	  public DuplicateEntryExistException(String msg) 
		{
				super(msg);
		}
	}
