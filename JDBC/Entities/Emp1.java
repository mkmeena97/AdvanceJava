package entities;

import java.sql.Date;

public class Emp1 implements Comparable<Emp1> {
	
	private int EMPNO;
	private String ENAME;
	private String JOB;
	private int MGR;
	private Date HIREDATE;
	private float SAL;
	private float COMM;
	private int DEPTNO;
	
	
	public Emp1() {
		super();
	}


	public Emp1(int eMPNO, String eNAME, String jOB, int mGR, Date hIREDATE, float sAL, float cOMM, int dEPTNO) {
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
		return "Emp1 [EMPNO : " + EMPNO + ", ENAME : " + ENAME + ", JOB : " + JOB + ", MGR : " + MGR + ", HIREDATE : " + HIREDATE
				+ ", SAL : " + SAL + ", COMM : " + COMM + ", DEPTNO : " + DEPTNO + "]";
	}


	@Override
	public int compareTo(Emp1 o) {

		if((this.ENAME.compareTo(o.ENAME))>0)
			return 1;
		if((this.ENAME.compareTo(o.ENAME))==0)
			return 0;
		else
			return -1;
		
	}
	
	

}
