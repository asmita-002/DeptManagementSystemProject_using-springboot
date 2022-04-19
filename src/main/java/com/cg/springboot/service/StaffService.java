package com.cg.springboot.service;

import java.util.List;

import com.cg.springboot.entity.Staff;

public interface StaffService {
	
	Staff saveStaff(Staff staff);

	List<Staff> getAllStaff();

	Staff getStaffById(int id);

	Staff updateStaff(Staff staff, int id);

	void deleteStaff(int id);
	

}
