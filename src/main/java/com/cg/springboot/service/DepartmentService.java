package com.cg.springboot.service;

import java.util.List;

import com.cg.springboot.entity.Department;

public interface DepartmentService {
	
	
	Department saveDepartment(Department Department);

	List<Department> getAllDepartments();

	 Department getDepartmentById(int id);

	Department updateDepartment(Department Department, int id);

	void deleteDepartment(int id);
}