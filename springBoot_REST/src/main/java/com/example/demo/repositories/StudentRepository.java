package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	
	//Excecute Query
	//JPQL-below query equivelent with (select * from emp)
	@Query("select s from Student s")
	public List<Student> getAllStudent();
	
	
	//Excecute Query
	//JPQL
	@Query("select s from Student s where s.sid=:sid")
	public Student getStudentById(int sid);
	
	//Excecute Query
	//JPQL
	@Query("select s from Student s where s.average=:avg")
	public List<Student> getStudentByAvg(float avg);
	
	
	
	
}
