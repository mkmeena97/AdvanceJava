package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Comment;
import com.example.demo.repositories.CommentRepository;

@Service
public class CommentService 
{
	@Autowired
	CommentRepository crepo;
	
	public List<Comment> getAll()
	{
		return crepo.findAll();
	}
	
	public Comment getComment(int cid)
	{
		Optional<Comment> op = crepo.findById(cid);
		Comment c = null;
		try
		{
			c= op.get();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return c;
	}
	
	public Comment saveComment(Comment c)
	{
		return crepo.save(c);
	}
}
