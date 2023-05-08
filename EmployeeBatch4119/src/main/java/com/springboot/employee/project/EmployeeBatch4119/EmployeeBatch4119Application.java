package com.springboot.employee.project.EmployeeBatch4119;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.employee.project.EmployeeBatch4119.model.Employee;
import com.springboot.employee.project.EmployeeBatch4119.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeBatch4119Application implements CommandLineRunner {
	 @Autowired
		EmployeeRepository sr;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeBatch4119Application.class, args);
	}



		@Override
		public void run(String... args) throws Exception {
			sr.save(new Employee("Megha Tomar",50000,"megha@gmail.com","Ghaziabad"));
	        sr.save(new Employee("Sana Saifi",60000,"Sana@gmail.com","Ghaziabad"));
			sr.save(new Employee("Madhuri Dixit",55000,"madhuri@gmail.com","Ghaziabad"));
	        sr.save(new Employee("Ritu",60000,"Ritu@gmail.com","Ghaziabad"));
		}
}