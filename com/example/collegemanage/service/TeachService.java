package com.example.collegemanage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.collegemanage.Entity.Teach;
import com.example.collegemanage.Repository.TeachRepository;

@Service
public class TeachService {
	@Autowired
	TeachRepository tr;
	public Teach add(Teach t) {
		return tr.save(t);
	}
public Optional<Teach>getByID(Long id){
	return tr.findById(id);
}
public List<Teach>getAll(){
	return tr.findAll();	
}
public String delete(Long id) {
	 tr.findById(id);
	 return "id deleted"+id;
}
public Teach update(Teach t) {
	Teach tk=tr.findById(t.getEmpId()).orElse(null);
	tk.setEmail(t.getEmail());
	tk.setEmpId(t.getEmpId());
	tk.setName(t.getName());
	tk.setSubject(t.getSubject());
	tk.setSalary(t.getSalary());
	return tr.save(tk);
	
}

}
