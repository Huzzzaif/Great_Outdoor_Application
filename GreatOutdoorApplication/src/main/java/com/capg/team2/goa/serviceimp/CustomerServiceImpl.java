package com.capg.team2.goa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.capg.team2.goa.dao.CustomerDAO;
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
		/*Optional<Customer> customer2 = iCustomerRepository.findById(customer.getCustomerId());
		try {
			if (customer2.isPresent()) {
				throw new CustomerAlreadyExistsException("Customer Already Exists");
				
			} else {
				return iCustomerRepository.save(customer);
			}
		} catch (CustomerAlreadyExistsException caee) {
			System.out.println(caee);
		}*/
		// return iCustomerRepository.addCustomer(customer);
		
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException{
		/*Optional<Customer> customer2 = iCustomerRepository.findById(customer.getCustomerId());
		try {
			if (customer2.isPresent()) {
				Customer customer3 = customer2.get();
				customer3.setCustomerName(customer.getCustomerName());
				customer3.setMobileNo(customer.getMobileNo());
				customer3.setEmail(customer.getEmail());
				customer3.setAddress(customer.getAddress());
				iiiCustomerRepository.updateCustomer(customer3);
				return customer3;
			} else {
				throw new CustomerNotFoundException("Customer Not Found");
			}
		} catch (CustomerNotFoundException cnfe) {
			System.out.println(cnfe);
		}*/
		// Customer customer2=null;
		// customer2=iCustomerRepository.updateCustomer(customer);
		Customer customer2=customerRepository.updateCustomer(customer);
		return customer2;
	}

	@Override
	public Customer removeCustomer(Customer customer) throws CustomerNotFoundException {
		/*
		 * int cus=customer.getCustomerId(); iCustomerRepository.remove(cus);
		 */
		// return iCustomerRepository.removeCustomer(customer);
		// Customer customer2 = null;
		/*Optional<Customer> customer2 = iCustomerRepository.findById(customer.getCustomerId());
		try {
			if (customer2.isPresent()) {
				iiiCustomerRepository.removeCustomer(customer);

			} else
				throw new CustomerNotFoundException("Customer Not Found");

		} catch (CustomerNotFoundException cnfe) {
			System.out.println(cnfe);
		}*/
		Customer customer2=customerRepository.removeCustomer(customer);
		return customer2;

	}

	@Override
	public Customer viewCustomer(Customer customer) throws CustomerNotFoundException{
		// return iCustomerRepository.viewCustomer(customer);
		/*Optional<Customer> customer2 = iCustomerRepository.findById(customer.getCustomerId());
		try {
			if (customer2.isPresent()) {

				return iCustomerRepository.viewCustomer(customer);

			} else {
				// Customer customer2 = null;
				throw new CustomerNotFoundException("Customer Not Found");

			}
		} catch (CustomerNotFoundException cnfe) {
			System.out.println(cnfe);
		}*/
		Customer customer2=customerRepository.viewCustomer(customer);
		return customer2;
	}
}
