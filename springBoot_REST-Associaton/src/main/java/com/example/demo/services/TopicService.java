package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Topic;
import com.example.demo.repositories.TopicRepository;

@Service
public class TopicService
{
	@Autowired
	TopicRepository trepo;
	
	public  List<Topic> getall()
	{
		return trepo.findAll();
	}
	
	public Topic getTopic(int tid)
	{
		Optional<Topic> op = trepo.findById(tid);
		Topic t = null;
		 try 
		 {
			 t = op.get();
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 return t;
		
	}
	
	
	public Topic saveTopic(Topic t)
	{
		return trepo.save(t);
	}
	
	public Topic getByName(String name)
	{
		return trepo.findByName(name);
	}
	
}
