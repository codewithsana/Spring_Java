package com.springboot.employee.project.EmployeeBatch4119.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.employee.project.EmployeeBatch4119.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}