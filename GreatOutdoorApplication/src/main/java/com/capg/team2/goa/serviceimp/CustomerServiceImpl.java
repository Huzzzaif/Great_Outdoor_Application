package com.capg.team2.goa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.capg.team2.goa.entity.Customer;
import com.capg.team2.goa.exception.CustomerNotFoundException;
import com.capg.team2.goa.exception.CustomerAlreadyExistsException;
import com.capg.team2.goa.repository.ICustomerRepository;
import com.capg.team2.goa.repository.CustomerRepositoryImpl;

@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	private ICustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomers() {
		
		List<Customer> customers=customerRepository.getAllCustomers();
		 
		return customers;
	}

	@Override
	public Customer addCustomer(Customer customer) throws CustomerAlreadyExistsException{
		Customer customer2=customerRepository.addCustomer(customer);
		return customer2;
		
		
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException{
		
		Customer customer2=customerRepository.updateCustomer(customer);
		return customer2;
	}

	@Override
	public Customer removeCustomer(Customer customer) throws CustomerNotFoundException {
		
		Customer customer2=customerRepository.removeCustomer(customer);
		return customer2;

	}

	@Override
	public Customer viewCustomer(Customer customer) throws CustomerNotFoundException{
		
		Customer customer2=customerRepository.viewCustomer(customer);
		return customer2;
	}
}
