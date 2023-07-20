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
import com.example.demo.services.CommentService;

@RestController
public class CommentController {
	
	@Autowired
	CommentService cservice;
	
	@GetMapping("/getcomment")
	public List<Comment> getAll()
	{
		return cservice.getAll();
	}
	
	@GetMapping("getcommentbyid")
	public Comment getComment(@RequestParam int cid)
	{
		return cservice.getComment(cid);
	}
	
	@PostMapping("/savecomment")
	public Comment SaveComment(@RequestBody Comment c)
	{
		return cservice.saveComment(c);
	}
	
	
}
