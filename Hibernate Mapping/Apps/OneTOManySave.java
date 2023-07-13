package apps;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Category;
import entities.Product;

public class OneTOManySave {

	public static void main(String[] args) {

		//create the service
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
				
		//read the info from hibernate.cfg.xml file
		Metadata metadata= new MetadataSources(registry).getMetadataBuilder().build();
				
		//Connect to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
				
		Session session = sf.openSession();
		
		//save master(category) seperately
	/*	Category c = new Category("Electronics","Electronics items");
		
		Transaction tr = session.beginTransaction();
		session.save(c);
		tr.commit();
	*/
		
		//save chlid(product) seperatly
	/*	Product p = new Product("Leptop",69999.99f,session.get(Category.class, 1));
		Transaction tr = session.beginTransaction();
		session.save(p);
		tr.commit();
	*/
		
		//save new master(category) along with its children(products)
		//cascade annotation
		//itrate the child collection and assign this for every child
		//Product p = new Product("Mobile",24999.50f,session.get(Category.class, 1));
		Product p1 = new Product("Shoes",4999.50f,session.get(Category.class, 104));
		Product p2 = new Product("T-shirt",999.50f,session.get(Category.class, 3));
		Product p3 = new Product("Jeans",2999.50f,session.get(Category.class, 3));
		Set<Product> products = new HashSet();
		//products.add(p);
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		
		
		Category c = new Category("Sports","Sports cloth");
		c.setProducts(products);
		//Category c1 = new Category("cloth","Fashion cloth");
		
		Transaction tr = session.beginTransaction();
		session.save(c);
	//	session.save(c1);
		tr.commit();
		
		session.close();
		sf.close();
		
		
		
		
	}

}
