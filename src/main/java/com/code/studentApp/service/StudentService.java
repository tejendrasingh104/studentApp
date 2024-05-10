package com.code.studentApp.service;

import java.util.List;
import java.util.Optional;

import com.code.studentApp.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	public Optional<Student> fetchStudent(Integer id);
	public List<Student> fetchAllStudent();
}
