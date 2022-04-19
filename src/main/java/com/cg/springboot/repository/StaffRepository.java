package com.cg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.springboot.entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer>{

}
