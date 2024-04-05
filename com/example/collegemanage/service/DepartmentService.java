package com.example.collegemanage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.collegemanage.Entity.Department;
import com.example.collegemanage.Repository.DepartmentRepository;
import com.example.collegemanage.Repository.EmployeeRepository;

@Service
public class DepartmentService {
	@Autowired
	DepartmentRepository dp;
	@Autowired
	EmployeeRepository es;
	
	public Department savedept(Department department) {
		
		return dp.save(department);
	}
	
	public Optional<Department> getdeptById(Long id) {
	return dp.findById(id);
	}
	public List<Department>getAll(){
		return(List<Department>) dp.findAll();
	}
	public String delete(Long id) {
	    dp.deleteById(id);
	    return "Department with id " + id + " has been deleted";
	}
	public Department update(Department dept) {
		Department d=dp.findById(dept.getDeptid()).orElse(null);
		d.setDeptid(dept.getDeptid());
		d.setName(dept.getName());
		d.setStaffmembers(dept.getStaffmembers());
		return dp.save(d);

}
	public Department getDepbyname(String name) {
		return dp.findByName(name);
	}
	
}
