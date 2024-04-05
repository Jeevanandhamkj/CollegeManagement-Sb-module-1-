package com.example.collegemanage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.collegemanage.Entity.Employee;
import com.example.collegemanage.Exceptionhandle.UserAlreadyExistsException;
import com.example.collegemanage.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping("/add")
	public void adding(@RequestBody @Valid Employee e) {
		try {
			Employee e1=es.addEmp(e);
		}
		catch(UserAlreadyExistsException ex){
			throw new UserAlreadyExistsException("user already exits");
		}
		
	}
	@GetMapping("/get/{id}")
	public Employee getById(@PathVariable Long id){
		return es.getById(id);
	}
	@GetMapping("/getAll")
	public List<Employee>getAll(){
		return es.getAll();
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		return es.delete(id);
		
	}
	@PutMapping("/update")
	public Employee update(@RequestBody Employee e) {
		return es.update(e);
	}

}
