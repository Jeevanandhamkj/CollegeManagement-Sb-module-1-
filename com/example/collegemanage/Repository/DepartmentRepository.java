package com.example.collegemanage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.collegemanage.Entity.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

	 Department findByName(String name);

	

	

}
