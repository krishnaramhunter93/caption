package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.controller.CustomerController;
import com.example.dao.Customer;
import com.example.repository.CustomerRepository;
import com.example.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer getCustomerById(Long id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id).orElse(null);
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public void deleteCustomer(Long id) {

		customerRepository.deleteById(id);
		;

	}

}
