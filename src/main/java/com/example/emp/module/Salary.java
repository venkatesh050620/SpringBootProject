package com.example.emp.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "SalaryDet")
public class Salary {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int salary_id;
	    private Double salary;
	    
		public int getSalary_id() {
			return salary_id;
		}
		public void setSalary_id(int salary_id) {
			this.salary_id = salary_id;
		}
		public Double getSalary() {
			return salary;
		}
		public void setSalary(Double salary) {
			this.salary = salary;
		}

}
