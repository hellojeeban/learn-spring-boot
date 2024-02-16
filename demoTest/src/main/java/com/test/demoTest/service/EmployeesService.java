package com.test.demoTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demoTest.entity.Employees;
import com.test.demoTest.repository.EmpRepository;

@Service
public class EmployeesService {
	@Autowired
	private EmpRepository repository;

	public Employees saveEmp(Employees emp) {
		return repository.save(emp);
	}

	public List<Employees> saveEmps(List<Employees> emps) {
		return repository.saveAll(emps);
	}

	public List<Employees> getEmps() {
		return repository.findAll();
	}

	public Employees getEmpById(int id) {
		return repository.findById(id).orElse(null);
	}


	public String deleteEmp(int id) {
		repository.deleteById(id);
		return "product removed !! " + id;
	}

	public Employees updateEmp(Employees emp) {
		Employees existingEmp = repository.findById(emp.getId()).orElse(null);
		existingEmp.setName(emp.getName());
		existingEmp.setAge(emp.getAge());
		existingEmp.setSalary(emp.getSalary());

		return repository.save(existingEmp);
	}


}
