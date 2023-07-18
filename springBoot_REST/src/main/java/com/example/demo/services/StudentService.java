package com.example.demo.services;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.Student;
import com.example.demo.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository srepo;
	
	
	
	public List<Student> getAll()
	{
		return srepo.getAllStudent();
	}
	
	public Student getStudentBySid(int sid)
	{
		Optional<Student> ostud = srepo.findById(sid);
		Student s = null;
		try {
			s = ostud.get();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return s;
		
		//return srepo.findById(sid).get(); 
	}
	
	public Student saveStudent(Student s)
	{
		return srepo.save(s);
	}
	
	
	
}
