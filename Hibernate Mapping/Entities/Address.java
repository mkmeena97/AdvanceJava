package entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class Address 
{
	@Column
	private String area;
	@Column
	private String city;
	@Column
	private String pincode;
	
	
	public Address() 
	{
		super();
	
	}


	public Address(String area, String city, String pincode) {
		super();
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	
	
	

}
