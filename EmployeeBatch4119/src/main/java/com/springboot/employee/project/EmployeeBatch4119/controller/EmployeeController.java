package com.springboot.employee.project.EmployeeBatch4119.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.employee.project.EmployeeBatch4119.model.Employee;
import com.springboot.employee.project.EmployeeBatch4119.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

		@Autowired
	EmployeeRepository sr;
	@RequestMapping("/details")
	public List<Employee> getStudents(){
		return sr.findAll();
	}
	}

