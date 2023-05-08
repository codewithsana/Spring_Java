package com.springboot.user.project1.UserBatch4119Ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.user.project1.UserBatch4119Ex1.model.Student;
import com.springboot.user.project1.UserBatch4119Ex1.repository.StudentRepository;

@SpringBootApplication
public class UserBatch4119Ex1Application implements CommandLineRunner{
	@Autowired
	StudentRepository sr;
	public static void main(String[] args) {
		SpringApplication.run(UserBatch4119Ex1Application.class, args);
	}



@Override
public void run(String... args) throws Exception {
this.sr.save(new Student("Arun Kumar","Anudeep","arun.kumar@gmail.com"));
this.sr.save(new Student("Deepak Yadhav","Anudeep","deepak.yadhav@gmail.com"));
}
}
