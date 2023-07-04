package com.example.emp.service;

import java.util.List;

import com.example.emp.module.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(Integer id);
	public Employee createEmployee(Employee employee);
	public Employee updateEmployee(Integer id, Employee employee);
	public void deleteEmployee(Integer id) ;


}
