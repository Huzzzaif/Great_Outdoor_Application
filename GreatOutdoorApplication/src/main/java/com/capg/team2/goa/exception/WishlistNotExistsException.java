package com.capg.team2.goa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class WishlistNotExistsException extends RuntimeException 
{
	public WishlistNotExistsException() 
	{
		super();	
	}
	
	public WishlistNotExistsException(String message)
	{
		super(message);	
	}
}
