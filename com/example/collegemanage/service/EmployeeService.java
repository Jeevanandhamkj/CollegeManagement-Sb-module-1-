package com.example.collegemanage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.collegemanage.Entity.Employee;
import com.example.collegemanage.Exceptionhandle.UserAlreadyExistsException;
import com.example.collegemanage.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	 @Autowired
	EmployeeRepository Ep;
	 
	 public Employee addEmp(Employee emp) {
		 Employee e=Ep.findByEmail(emp.getEmail());
		 if(e!=null) {
			 throw new UserAlreadyExistsException("Employee with email already exists");
		 }
		 else {
		 return Ep.save(emp);
	 }
	 }
	 public Employee getById(Long id){
		 Optional<Employee>ee=Ep.findById(id);
		 if(ee.isPresent()) {
			 return ee.get();
		 }
		 else {
			 return null;
		 }
	 }
	 public List<Employee>getAll(){
		 return Ep.findAll();
	 }
		 public String delete(Long id) {
			 Ep.deleteById(id);
			 return "Employee deleted" +id;
			 
		 }
		 public Employee update(Employee e) {
			 Employee ee=Ep.findById(e.getEmpId()).orElse(null);
			
			 ee.setEmail(e.getEmail());
			 ee.setEmpId(e.getEmpId());
			 ee.setName(e.getName());
			 ee.setSalary(e.getSalary());
			 return Ep.save(ee);
		 }
	 }
	 


