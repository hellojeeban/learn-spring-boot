package com.test.demoTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.demoTest.entity.Employees;


public interface EmpRepository extends JpaRepository<Employees,Integer> {
	
}

