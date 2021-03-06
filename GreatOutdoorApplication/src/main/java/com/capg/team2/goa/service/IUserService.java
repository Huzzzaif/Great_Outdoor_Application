package com.capg.team2.goa.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.capg.team2.goa.entity.Userdata;
import com.capg.team2.goa.exception.AlreadyExistsException;
import com.capg.team2.goa.exception.IncorrectCredentialsException;
import com.capg.team2.goa.exception.UserNotFoundException;

@Service
public interface IUserService
{
	
	public Userdata addUser(Userdata user) throws AlreadyExistsException;
	public Userdata loginUser(Userdata u) throws IncorrectCredentialsException;
	public Userdata logout(Userdata user) throws UserNotFoundException;

	
}