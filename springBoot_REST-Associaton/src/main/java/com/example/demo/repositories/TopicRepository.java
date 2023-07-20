package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer> {
	
	
	@Query("select t from Topic t where t.name=:name")
	public Topic findByName(String name);
	
	

}
