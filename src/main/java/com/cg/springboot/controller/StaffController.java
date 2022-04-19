package com.cg.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springboot.entity.Staff;
import com.cg.springboot.service.StaffService;

@RestController
public class StaffController {
	
	@Autowired
	StaffService staffservice;
	
	@PostMapping("/post2")
	public Staff saveDepartment(@RequestBody Staff staff) {
//		return new ResponseEntity<Department>(staffservice.saveStaff(staff), HttpStatus.CREATED);
		return staffservice.saveStaff(staff);
	}

}
