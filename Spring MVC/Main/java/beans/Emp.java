package beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

	private int empid;
	private Name ename;
	private float salary;
	private Address address;
	private Dept dept;
	private List<String> emails;
	
	public Emp() {
		super();
	
	}

	
	
	
	public Emp(int empid, Name ename, float salary, Address address, Dept dept, List<String> emails) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.address = address;
		this.dept = dept;
		this.emails = emails;
	}




	public Name getEname() {
		return ename;
	}




	public void setEname(Name ename) {
		this.ename = ename;
	}




	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", address=" + address + ", dept="
				+ dept + ", emails=" + emails + "]";
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	
	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	
	

}
