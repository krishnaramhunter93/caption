package com.example.service;

import com.example.controller.CustomerController;
import com.example.dao.Customer;

public interface CustomerService {

	Customer getCustomerById(Long id);

	Customer saveCustomer(Customer customer);

	void deleteCustomer(Long id);

}
