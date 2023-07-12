package entities;

import java.sql.Date;
import java.util.Objects;

public class Emp3 {
	
	private int EMPNO;
	private String ENAME;
	private String JOB;
	private int MGR;
	private Date HIREDATE;
	private float SAL;
	private float COMM;
	private int DEPTNO;
	public Emp3() {
		super();
	}
	public Emp3(int eMPNO, String eNAME, String jOB, int mGR, Date hIREDATE, float sAL, float cOMM, int dEPTNO) {
		super();
		EMPNO = eMPNO;
		ENAME = eNAME;
		JOB = jOB;
		MGR = mGR;
		HIREDATE = hIREDATE;
		SAL = sAL;
		COMM = cOMM;
		DEPTNO = dEPTNO;
	}
	public int getEMPNO() {
		return EMPNO;
	}
	public void setEMPNO(int eMPNO) {
		EMPNO = eMPNO;
	}
	public String getENAME() {
		return ENAME;
	}
	public void setENAME(String eNAME) {
		ENAME = eNAME;
	}
	public String getJOB() {
		return JOB;
	}
	public void setJOB(String jOB) {
		JOB = jOB;
	}
	public int getMGR() {
		return MGR;
	}
	public void setMGR(int mGR) {
		MGR = mGR;
	}
	public Date getHIREDATE() {
		return HIREDATE;
	}
	public void setHIREDATE(Date hIREDATE) {
		HIREDATE = hIREDATE;
	}
	public float getSAL() {
		return SAL;
	}
	public void setSAL(float sAL) {
		SAL = sAL;
	}
	public float getCOMM() {
		return COMM;
	}
	public void setCOMM(float cOMM) {
		COMM = cOMM;
	}
	public int getDEPTNO() {
		return DEPTNO;
	}
	public void setDEPTNO(int dEPTNO) {
		DEPTNO = dEPTNO;
	}
	@Override
	public String toString() {
		return "Emp4 [EMPNO=" + EMPNO + ", ENAME=" + ENAME + ", JOB=" + JOB + ", MGR=" + MGR + ", HIREDATE=" + HIREDATE
				+ ", SAL=" + SAL + ", COMM=" + COMM + ", DEPTNO=" + DEPTNO + "]";
	}
	@Override
	public int hashCode() {
		return DEPTNO;
	}
	
	public boolean equals(Emp3 obj) 
	{
	  if(this.DEPTNO == obj.DEPTNO)
		  return true;
	  else
		  return false;
			
				
	}
	
	

}
