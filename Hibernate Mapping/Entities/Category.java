package entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="categories")
public class Category 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	@Column
	private String cname;
	@Column
	private String cdesc;
	
	@OneToMany
	@Cascade(value=CascadeType.ALL)
	Set<Product> products;
	
	
	
	public Category() 
	{
		super();
	}


	public Category(String cname, String cdesc, Set<Product> products) {
		super();
		this.cname = cname;
		this.cdesc = cdesc;
		for(Product p:products)
			p.setCategory(this);
		this.products=products;
			
	}
	
	


	public Category(String cname,String cdesc) {
		super();
		this.cname = cname;
		this.cdesc=cdesc;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getCdesc() {
		return cdesc;
	}


	public void setCdesc(String cdesc) {
		this.cdesc = cdesc;
	}
	
	public Set<Product> getProducts(){
		return products;
	}
	
	public void setProducts(Set<Product> products) {
		for(Product p : products)
			p.setCategory(this);
		this.products=products;
	}
	
	
	
	
	
	

}
