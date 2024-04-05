package com.example.collegemanage.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table
public class Teach extends Employee{
	public Teach(Long empId, String name, String email, double salary) {
		super(empId, name, email, salary);
		// TODO Auto-generated constructor stub
	}
@NotEmpty(message="teach staff subject cannot been empty")
	private String Subject;

	public String getSubject() {
		return Subject;
	}

	public Teach() {
		super();
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public Teach(Long empId, String name, String email, double salary, String subject) {
		super(empId, name, email, salary);
		Subject = subject;
	}
	

}
