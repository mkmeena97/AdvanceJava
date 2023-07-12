
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table
@NamedQuery(name="getBySal",query="select empid,ename,job from Emp1 where salary>:min and salary<:max ")
public class Emp1 {
	@Id
	@Column(name="EMPNO")
	private int empid;
	
	@Column(name="ENAME")
	String ename;
	
	@Column(name="DEPTNO")
	int deptno;
	
	@Column(name="SAL")
	float salary;
	
	@Column(name="JOB")
	String job;
	
	@Column(name="MGR")
	int mgr;
	
	@Column(name="HIREDATE")
	Date hiredate;

	



	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Emp(int empid, String ename, int deptno, float salary) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.deptno = deptno;
		this.salary = salary;
	}
	
	



	public Emp(int empid, String ename, int deptno, float salary, String job, int mgr, Date hiredate) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.deptno = deptno;
		this.salary = salary;
		this.job = job;
		//this.mgr = mgr;
		this.hiredate = hiredate;
	}



	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public String getJob() {
		return job;
	}



	public void setJob(String job) {
		this.job = job;
	}



	/* public int getMgr() {
		return mgr;
	}



	public void setMgr(int mgr) {
		this.mgr = mgr;
	} */



	public Date getHiredate() {
		return hiredate;
	}



	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
	
	
}
