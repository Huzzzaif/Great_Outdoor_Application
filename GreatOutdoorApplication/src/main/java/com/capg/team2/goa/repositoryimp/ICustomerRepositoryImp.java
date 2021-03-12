package com.capg.team2.goa.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.capg.team2.goa.entity.Customer;
import com.capg.team2.goa.exception.CustomerAlreadyExistsException;
import com.capg.team2.goa.exception.CustomerNotFoundException;
import com.capg.team2.goa.repository.CustomerRepository;
import com.capg.team2.goa.repository.ICustomerRepository;
@Repository
public class ICustomerRepositoryImp implements ICustomerRepository {
	@Autowired
	private CustomerRepository customerRepository;
	
	

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		List<Customer> customers=(List<Customer>)customerRepository.findAll();
		return customers;
	}

	public Customer addCustomer(Customer customer) throws CustomerAlreadyExistsException{
		// TODO Auto-generated method stub
		Optional<Customer> customer2 = customerRepository.findById(customer.getCustomerId());
		try {
			if (customer2.isPresent()) {
				throw new CustomerAlreadyExistsException("Customer Already Exists");
				
			} else {
				return customerRepository.save(customer);
			}
		} catch (CustomerAlreadyExistsException caee) {
			System.out.println(caee);
		}
			return customer;
			}
	
		public Customer updateCustomer(Customer customer) throws CustomerNotFoundException{
		// TODO Auto-generated method stub
			Optional<Customer> customer2 = customerRepository.findById(customer.getCustomerId());
			try {
				if (customer2.isPresent()) {
					Customer customer3 = customer2.get();
					customer3.setCustomerName(customer.getCustomerName());
					customer3.setMobileNo(customer.getMobileNo());
					customer3.setEmail(customer.getEmail());
					customer3.setAddress(customer.getAddress());
					customerRepository.save(customer3);
					return customer3;
				} else {
					throw new CustomerNotFoundException("Customer Not Found");
				}
			} catch (CustomerNotFoundException cnfe) {
				System.out.println(cnfe);
			}
			
		return customer;
	}

	public Customer removeCustomer(Customer customer) throws CustomerNotFoundException{
		// TODO Auto-generated method stub
		Optional<Customer> customer2 = customerRepository.findById(customer.getCustomerId());
		try {
			if (customer2.isPresent()) {
				customerRepository.delete(customer);

			} else
				throw new CustomerNotFoundException("Customer Not Found");

		} catch (CustomerNotFoundException cnfe) {
			System.out.println(cnfe);
		}
		
		return customer;
	}

	public Customer viewCustomer(Customer customer) throws CustomerNotFoundException{
	
		Optional<Customer> customer2 = customerRepository.findById(customer.getCustomerId());
		try {
			if (customer2.isPresent()) {

				return (Customer) customerRepository.findAll();

			} else {
				// Customer customer2 = null;
				throw new CustomerNotFoundException("Customer Not Found");

			}
		} catch (CustomerNotFoundException cnfe) {
			System.out.println(cnfe);
		}
		return customer;
	}

}