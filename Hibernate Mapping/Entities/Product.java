package entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="products")
public class Product 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	@Column
	private String name;
	@Column
	private float price;
	
	
	@ManyToOne
	@JoinColumn(name="cid")
	Category category;


	public Product() 
	{
		super();
	
	}


	public Product( String name, float price, Category category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category=category;
		
	}


	
	
	
	
	
	
	
}
