package com.example.demo.entities;

import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="topic")
public class Topic {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int topicid;
	@Column
	private String name;
	@Column
	private String description;
	
	@JsonIgnoreProperties("topics")
	@OneToMany(mappedBy = "topic", cascade = CascadeType.ALL )
	Set<Comment> comments;

	
	public Topic() 
	{
		super();
	}

	public Topic(int topicid, String name, String desc, Set<Comment> comments) {
		super();
		this.topicid = topicid;
		this.name = name;
		this.description = desc;
		this.comments = comments;
	}
	
	

	public int getTopicid() {
		return topicid;
	}

	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String desc) {
		this.description = desc;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments)
	{
		for(Comment c : comments)
			c.setTopic(this);
		this.comments = comments;
	}


}
