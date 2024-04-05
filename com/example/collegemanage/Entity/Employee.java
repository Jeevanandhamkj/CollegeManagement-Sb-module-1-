package com.example.collegemanage.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long empId;
	@NotEmpty(message="Employee name cannot be null")
	private String name;
	@Email(message="this type of email not valid")
	private String email;
	@NotNull(message="Salary cannot be empty")
	private double salary;
	public Employee() {
		super();
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(Long empId, String name, String email, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	
	
	

}
