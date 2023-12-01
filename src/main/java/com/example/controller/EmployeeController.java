package com.example.controller;

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

import com.example.dao.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/welcome")
public class EmployeeController {
	/*
	 * Get all employees: GET http://localhost:8080/employees Get an employee by ID:
	 * GET http://localhost:8080/employees/{id} Create a new employee: POST
	 * http://localhost:8080/employees Update an employee: PUT
	 * http://localhost:8080/employees/{id} Delete an employee: DELETE
	 * http://localhost:8080/employees/{id}
	 */
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/hello")
	public String checkM() {
		return "Welcome to springboot";
	}

	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return employeeService.getEmployeeById(id);
	}

	@PostMapping("/write")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee updatedEmployee) {
		Employee employee = employeeService.getEmployeeById(id);
		if (employee != null) {
			employee.setFirstName(updatedEmployee.getFirstName());
			employee.setLastName(updatedEmployee.getLastName());
			employee.setDesignation(updatedEmployee.getDesignation());
			// Update other attributes as needed
			return employeeService.saveEmployee(employee);
		}
		return null; // Handle not found case
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployeeById(id);
	}

}
