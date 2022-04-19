package com.cg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springboot.entity.Department;
import com.cg.springboot.service.DepartmentService;

@RestController
//@RequestMapping("/api/Departments")
public class DepartmenttController {
	
	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/post")
	public ResponseEntity<Department> saveDepartment(@RequestBody Department Department) {
		return new ResponseEntity<Department>(departmentService.saveDepartment(Department), HttpStatus.CREATED);
	}

	@GetMapping("/get")
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}

	@GetMapping("{id}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable("id") int DepartmentId) {
		return new ResponseEntity<Department>(departmentService.getDepartmentById(DepartmentId), HttpStatus.OK);
	}

	@PutMapping("{id}")
	public ResponseEntity<Department> updateDepartment(@PathVariable("id") int id,
			@RequestBody Department Department) {
		return new ResponseEntity<Department>(departmentService.updateDepartment(Department, id), HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteDepartment(@PathVariable("id") int id) {

		departmentService.deleteDepartment(id);

		return new ResponseEntity<String>("Department deleted successfully!.", HttpStatus.OK);
	}

}