package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Comment;
import com.example.demo.entities.Topic;
import com.example.demo.services.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	TopicService tservice;	
	
	@GetMapping("/getalltopic")
	public List<Topic> getAll()
	{
		return tservice.getall();
	}
	
	@GetMapping("/gettopicbyid")
	public Topic getTopic(@RequestParam("id") int tid)
	{
		return tservice.getTopic(tid);
	}
	
	@PostMapping("/inserttopic")
	public Topic insertTopic(@RequestBody Topic t)
	{
		return tservice.saveTopic(t);
	}
	
	@GetMapping("/getbyname")
	public Topic getTopicByName(@RequestParam String name)
	{
		return tservice.getByName(name);
	}
	
}

