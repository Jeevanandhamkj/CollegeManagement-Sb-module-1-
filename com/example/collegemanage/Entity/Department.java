package com.example.collegemanage.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long deptid;
	@NotEmpty(message="Department name cannot be empty")
	private String name;
@OneToMany(targetEntity=Employee.class, cascade = CascadeType.ALL)
	@JoinColumn(name="cp_fk",referencedColumnName="deptid")

	private List<Employee> staffmembers;

	public Department() {
	super();
}
	public Long getDeptid() {
		return deptid;
	}
	public void setDeptid(Long deptid) {
		this.deptid = deptid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department(Long deptid, String name) {
		super();
		this.deptid = deptid;
		this.name = name;
	}
	public List<Employee> getStaffmembers() {
		return staffmembers;
	}
	public void setStaffmembers(List<Employee> staffmembers) {
		this.staffmembers = staffmembers;
	}
	
	

}
