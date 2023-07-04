package com.example.emp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.emp.module.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
