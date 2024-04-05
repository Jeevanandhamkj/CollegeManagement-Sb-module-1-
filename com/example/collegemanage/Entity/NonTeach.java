package com.example.collegemanage.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table
public class NonTeach extends Employee {
	@NotEmpty(message="Nontech staffs role cannot be empty")
	private String role;
	

	public String getRole() {
		return role;
	}


	public NonTeach(Long empId, String name, String email, double salary, String role) {
		super(empId, name, email, salary);
		this.role = role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	
	

}
