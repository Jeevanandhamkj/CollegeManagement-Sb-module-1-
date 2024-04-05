package com.example.collegemanage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.collegemanage.Entity.NonTeach;
import com.example.collegemanage.Repository.NonTechRepository;

@Service
public class NonTeachService {
	
	@Autowired
	NonTechRepository nr;
	 public NonTeach adding(NonTeach nt) {
		 return nr.save(nt);
	 }
	 public Optional<NonTeach>getByID(Long id){
		 return nr.findById(id);
	 }
	 public List<NonTeach>getAll(){
		 return nr.findAll();
	 }
	 public String delete(Long id) {
		  nr.deleteById(id);
		  return "id deleted" +id;
	 }
	 
	 public NonTeach update(NonTeach n) {
		 NonTeach nn=nr.findById(n.getEmpId()).orElse(null);
		 nn.setEmpId(n.getEmpId());
		 nn.setEmail(n.getEmail());
		 nn.setName(n.getName());
		 nn.setRole(n.getRole());
		 nn.setSalary(n.getSalary());
		 return nr.save(nn);
	 }

}
