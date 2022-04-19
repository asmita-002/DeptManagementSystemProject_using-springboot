package com.cg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.springboot.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
