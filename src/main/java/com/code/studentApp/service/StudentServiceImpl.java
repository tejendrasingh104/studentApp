package com.code.studentApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.studentApp.model.Student;
import com.code.studentApp.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Optional<Student> fetchStudent(Integer id) {
		
		return studentRepository.findById(id);
	}

	@Override
	public List<Student> fetchAllStudent() {
		return studentRepository.findAll();
	}

}
