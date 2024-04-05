package com.example.collegemanage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.collegemanage.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

	Employee findByEmail(String email);

}
