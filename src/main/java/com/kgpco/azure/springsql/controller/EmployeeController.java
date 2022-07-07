package com.kgpco.azure.springsql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kgpco.azure.springsql.model.Employee;
import com.kgpco.azure.springsql.model.EmployeeRepo;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepo repo;

	@PostMapping(value = "/employee", consumes = {"application/Json"})
	public Employee addEmployee(@RequestBody Employee employee) {
		return repo.save(employee);
	}

	@GetMapping("/employees")
	public List<Employee> getEmployees(@RequestBody Employee employee) {
		return repo.findAll();
	}

}
