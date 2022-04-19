package com.cg.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springboot.entity.Staff;
import com.cg.springboot.repository.StaffRepository;

@Service
public class StaffServiceImpl implements StaffService{
	
	@Autowired
	StaffRepository staffRepository;
	
	@Override
	public Staff saveStaff(Staff staff) {
		return staffRepository.save(staff);
	}

	@Override
	public List<Staff> getAllStaff() {
		return staffRepository.findAll();
	}

	@Override
	public Staff getStaffById(int id) {
		Optional<Staff> findById = staffRepository.findById(id);
		return  findById.get();
	}
	//Optional<Staff> getById = staffrepo.findById(id); 
//	if(getById.isPresent()) { 
//		save method 
//		} 

	@Override
	public Staff updateStaff(Staff staff, int id) {
		Optional<Staff> getById = staffRepository.findById(id); 
		if(getById.isPresent()) { 
			return staffRepository.save(staff);
		}
		else {
			return null;
		}
	}

	@Override
	public void deleteStaff(int id) {
		staffRepository.deleteById(id);
	}
	
	

}
