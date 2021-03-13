package com.capg.team2.goa.service;

public interface ICustomerService {
  
  public List<Customer> getAllCustomers();
	public Customer addCustomer(Customer customer) throws CustomerAlreadyExistsException;
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;
	public Customer removeCustomer(Customer customer) throws CustomerNotFoundException;
	public Customer viewCustomer(Customer customer) throws CustomerNotFoundException;

}
