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

import com.example.collegemanage.Entity.NonTeach;
import com.example.collegemanage.service.NonTeachService;

@RestController
@RequestMapping("/non")
public class NonTeachController {
	@Autowired
	NonTeachService nts;
	
	@PostMapping("/add")
	public NonTeach adding(@RequestBody NonTeach nt) {
		return nts.adding(nt);
	}
	@GetMapping("/view/{id}")
	public Optional<NonTeach>getByID(@PathVariable Long id){
		return nts.getByID(id);
	}
   @GetMapping("/viewAll")
   public List<NonTeach>getall(){
	   return nts.getAll();
   }
   @DeleteMapping("/delete/{id}")
   public String delete(@PathVariable Long id) {
	   return nts.delete(id);
   }
   @PutMapping("/update")
   public NonTeach update(@RequestBody NonTeach no) {
	   return nts.update(no);
   }
}
