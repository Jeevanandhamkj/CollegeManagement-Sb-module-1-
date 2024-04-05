package com.example.collegemanage.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.collegemanage.Entity.Department;
import com.example.collegemanage.Exceptionhandle.UserAlreadyExistsException;
import com.example.collegemanage.service.DepartmentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Department")
public class DepartmentController {
	Logger logger= LoggerFactory.getLogger(DepartmentController.class);
	@Autowired
	DepartmentService ds;
	
	@PostMapping("/add")
	//@PreAuthorize("hasRole('ROLE_Admin')")
	public Department adding(@Valid @RequestBody Department de) throws UserAlreadyExistsException{
		Department dd=ds.getDepbyname(de.getName());
		if(dd!=null) {
			throw new UserAlreadyExistsException("user with "+de.getName()+"Already exists");
		}
		else {
			logger.info("user has been added");
			return ds.savedept(de);
		}
		
	}
	@GetMapping("/get/{id}")
	public Optional<Department> getByid(@PathVariable long id) {
		return ds.getdeptById(id);
	}
	@GetMapping("/getAll")
	public List<Department>getAll(){
		logger.info("retrieving all department");
		return ds.getAll();
	}
	@DeleteMapping("delete/{id}")
	
	public void deletebyID(@PathVariable Long id) {
		ds.delete(id);
	}
	@PutMapping("/update")
	public Department update(@RequestBody Department d) {
		return ds.update(d);
	}
	
	}

