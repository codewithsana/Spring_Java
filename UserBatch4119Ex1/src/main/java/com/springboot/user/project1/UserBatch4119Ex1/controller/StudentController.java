package com.springboot.user.project1.UserBatch4119Ex1.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.user.project1.UserBatch4119Ex1.model.Student;
import com.springboot.user.project1.UserBatch4119Ex1.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
StudentRepository sr;
@RequestMapping("/details")
public List<Student> getStudents(){
return this.sr.findAll();
}
}

