package com.code.studentApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.studentApp.model.Student;
import com.code.studentApp.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

	@Autowired
	public StudentService studentService;
	
	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		studentService.saveStudent(student);
		return "New student saved";
	}
	
	@GetMapping("/fetch/{id}")
	public Optional<Student> fetchData(@PathVariable Integer id)
	{
		Optional<Student> data = studentService.fetchStudent(id);
		System.out.println("hi data");
		System.out.println(data);
		return data;
	}
	
	@GetMapping("/fetchAll")
	public List fetchAllData()
	{
		List<Student> data = studentService.fetchAllStudent();
		System.out.println(data);
		return data;
	}
}
