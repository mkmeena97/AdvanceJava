package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="prmntEmp")
@PrimaryKeyJoinColumn(name="empid")
public class PermanentEmp extends Emp 
{

	@Column
	private float allowance;
	@Column
	private float bonus;
	@Column
	private float deduction;
	
	
	public PermanentEmp() 
	{
		super();
	}


	public PermanentEmp(int empid, String name, String email, String contactno, float basic, float allowance,
			float bonus, float deduction) {
		super(empid, name, email, contactno, basic);
		this.allowance = allowance;
		this.bonus = bonus;
		this.deduction = deduction;
	}


	public float getAllowance() {
		return allowance;
	}


	public void setAllowance(float allowance) {
		this.allowance = allowance;
	}


	public float getBonus() {
		return bonus;
	}


	public void setBonus(float bonus) {
		this.bonus = bonus;
	}


	public float getDeduction() {
		return deduction;
	}


	public void setDeduction(float deduction) {
		this.deduction = deduction;
	}
	
	
	
	
	
	
	
}
