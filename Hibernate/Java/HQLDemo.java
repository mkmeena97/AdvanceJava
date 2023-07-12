package Apps;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

import entities.Emp;



public class HQLDemo {

	public static void main(String[] args) {
				//create the service
				StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
						
				//read the info hibernate.cfg.xml file
				Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
						
				//actually conn to database
				SessionFactory sf = metadata.getSessionFactoryBuilder().build();
				
				//open the session
				Session session = sf.openSession();
				
				
				//HQL-class Property
				Query q = session.createQuery("from Emp");
				 List<Emp> emps = q.getResultList();
				 for(Emp e : emps)
				 {
					 System.out.println(e.getEmpid()+" : "+e.getEname()+" : "+e.getJob()+" : "+e.getSalary());
				 }
				 
	}

}
