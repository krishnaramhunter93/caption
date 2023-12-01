package com.example.service;

import java.util.List;

import com.example.dao.Employee;

public interface EmployeeService {

	Employee getEmployeeById(Long id);

	List<Employee> getAllEmployees();

	Employee saveEmployee(Employee employee);




	void deleteEmployeeById(Long id);

}
