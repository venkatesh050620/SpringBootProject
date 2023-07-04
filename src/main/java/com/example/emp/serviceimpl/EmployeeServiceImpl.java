package com.example.emp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.emp.exception.ResourceNotFoundException;
import com.example.emp.module.Employee;
import com.example.emp.repo.EmployeeRepository;
import com.example.emp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
    private EmployeeRepository employeeRepository;
    
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    
    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElseThrow(null);
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Integer id, Employee employee) {
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(null);
        existingEmployee.setEmp_name(employee.getEmp_name());
        existingEmployee.setSalary(employee.getSalary());
        return employeeRepository.save(existingEmployee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(null);
        employeeRepository.delete(existingEmployee);
    }


}
