package com.code.studentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code.studentApp.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
