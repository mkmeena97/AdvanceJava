package entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int sid;
	@Column
	String name;
	@Embedded
	Address address;
	
	
	public Student() 
	{
		super();
	}


	public Student(int sid, String name, Address address) {
		super();
		this.sid = sid;
		this.name = name;
		this.address = address;
	}
	


	public Student(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	

}
