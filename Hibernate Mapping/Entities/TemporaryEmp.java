package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="tempEmp")
@PrimaryKeyJoinColumn(name="empid")
public class TemporaryEmp extends Emp
{
	@Column
	private float extrapay;
	@Column
	private float taxes;
	
	
	public TemporaryEmp() 
	{
		super();
	
	}


	public TemporaryEmp(int empid, String name, String email, String contactno, float basic, float extrapay,
			float taxes) {
		super(empid, name, email, contactno, basic);
		this.extrapay = extrapay;
		this.taxes = taxes;
	}


	public float getExtrapay() {
		return extrapay;
	}


	public void setExtrapay(float extrapay) {
		this.extrapay = extrapay;
	}


	public float getTaxes() {
		return taxes;
	}


	public void setTaxes(float taxes) {
		this.taxes = taxes;
	}
	
	
	
	

}
