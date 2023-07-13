package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Emp 
{
	@Id
	private int empid;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String contactno;
	@Column
	private float basic;
	
	public Emp() 
	{
		super();
	}

	public Emp(int empid, String name, String email, String contactno, float basic) {
		super();
		this.empid = empid;
		this.name = name;
		this.email = email;
		this.contactno = contactno;
		this.basic = basic;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public float getBasic() {
		return basic;
	}

	public void setBasic(float basic) {
		this.basic = basic;
	}
	
	
	
	
	
}
