package com.springboot.user.project1.UserBatch4119Ex1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.user.project1.UserBatch4119Ex1.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
}
