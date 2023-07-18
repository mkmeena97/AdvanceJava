package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentService;


@RestController
public class StudetController {
	
	@Autowired
	StudentService stservice;
	
	@GetMapping("/getallstudents")
	public List<Student> getAll()
	{
		return stservice.getAll();
	}
	
	@GetMapping("/getstudent")
	public Student getStudent(@RequestParam("studid") int sid)
	{
		return stservice.getStudentBySid(sid);
	}
	
	@PostMapping("/savestudent")
	public Student saveStudent(@RequestBody Student s)
	{
		return stservice.saveStudent(s);
	}
	
}
