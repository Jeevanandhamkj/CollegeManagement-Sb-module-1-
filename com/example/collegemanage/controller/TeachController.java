package com.example.collegemanage.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.collegemanage.Entity.Teach;
import com.example.collegemanage.service.TeachService;

@RestController
@RequestMapping("/teach")
public class TeachController {
	@Autowired
	TeachService tss;
	@PostMapping("/add")
	 public Teach adding(@RequestBody Teach t) {
		 return tss.add(t);
	 }
	@GetMapping("/view/{id}")
	public Optional<Teach>getById(@PathVariable Long id){
		return tss.getByID(id);
	}
	@GetMapping("/viewAll")
	public List<Teach>getAll(){
		return tss.getAll();
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id ) {
		tss.delete(id);
		return "id deleted"+id;
	}
	@PutMapping("/update")
	public Teach updating(@RequestBody Teach t) {
		return tss.update(t);
	}

}
