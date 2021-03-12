package com.capg.team2.goa.repository;


import org.springframework.stereotype.Repository;

import com.capg.team2.goa.entity.Userdata;
import com.capg.team2.goa.exception.AlreadyExistsException;
import com.capg.team2.goa.exception.IncorrectCredentialsException;
import com.capg.team2.goa.exception.UserNotFoundException;

@Repository
public interface IUserRepository   
{
	
	public Userdata addUser(Userdata user) throws AlreadyExistsException;
	public Userdata loginUser(Userdata u) throws IncorrectCredentialsException;
	public Userdata logout(Userdata user) throws UserNotFoundException;

	
}