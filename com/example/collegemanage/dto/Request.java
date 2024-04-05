package com.example.collegemanage.dto;

import com.example.collegemanage.Entity.Department;

public class Request {
private	Department departmet;

public Department getDepartmet() {
	return departmet;
}

public void setDepartmet(Department departmet) {
	this.departmet = departmet;
}

public Request(Department departmet) {
	super();
	this.departmet = departmet;
}


}
