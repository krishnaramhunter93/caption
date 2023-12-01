package com.example.controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.Customer;
import com.example.dao.Employee;
import com.example.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable Long id) {
		return customerService.getCustomerById(id);
	}

	@PostMapping("/create")
	public Customer createCustomer(@RequestBody Customer customer) {

		return customerService.saveCustomer(customer);
	}


	@PutMapping("/{id}")
	public Customer updateCustomer(@PathVariable Long id,@RequestBody Customer customerUpadate) {
		Customer customer = customerService.getCustomerById(id);
		if(customer !=null) {
			customer.setfName(customerUpadate.getfName());
			customer.setlName(customerUpadate.getlName());
			customer.setEmail(customerUpadate.getEmail());
			return customerService.saveCustomer(customer);
		}
		
		return null;
	}
	@DeleteMapping("/{id}")
	public void deleteCustomer(@PathVariable Long id) {
		customerService.deleteCustomer(id);
	}
	
	/*
	 * @GetMapping("/sort") public List<Customer> sortCustomerByName() {
	 * List<Customer> customer = getCustomer(); // Replace this with your data
	 * retrieval logic
	 * 
	 * // Sort the list of people based on age using a Comparator
	 * Collections.sort(customer, Comparator.//(Customer::getName));
	 * 
	 * return customer; }
	 */
}
