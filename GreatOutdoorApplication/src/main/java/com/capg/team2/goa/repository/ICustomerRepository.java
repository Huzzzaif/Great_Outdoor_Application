package com.capg.team2.goa.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.capg.team2.goa.entity.Customer;
import com.capg.team2.goa.exception.CustomerAlreadyExistsException;
import com.capg.team2.goa.exception.CustomerNotFoundException;
import com.capg.team2.goa.service.ICustomerService;

@Repository
public interface ICustomerRepository {


	public List<Customer> getAllCustomers();
	public Customer addCustomer(Customer customer) throws CustomerAlreadyExistsException;
	public Customer updateCustomer(Customer customer)throws CustomerNotFoundException;
	
	public Customer removeCustomer(Customer customer) throws CustomerNotFoundException;
	public Customer viewCustomer(Customer customer)throws CustomerNotFoundException;
	
}