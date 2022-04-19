package com.cg.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springboot.entity.Department;
import com.cg.springboot.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository departmentRepo;

	@Override
	public Department saveDepartment(Department department) {
		return departmentRepo.save(department);
	}

	@Override
	public List<Department> getAllDepartments() {
		return departmentRepo.findAll();
	}

	@Override
	public Department getDepartmentById(int id) {
		 Optional<Department> findById = departmentRepo.findById(id);
		 return findById.get();
	}

	@Override
	public Department updateDepartment(Department department, int id) {
		return departmentRepo.save(department);
	}

	@Override
	public void deleteDepartment(int id) {
		departmentRepo.deleteById(id);
	}
}
