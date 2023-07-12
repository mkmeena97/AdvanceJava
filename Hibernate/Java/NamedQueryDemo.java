package Apps;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class NamedQueryDemo {

	public static void main(String[] args) {
		//create the service
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
				
		//read the info hibernate.cfg.xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
				
		//actually conn to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		//open the session
		Session session = sf.openSession();
		
		Query q = session.createNamedQuery("getBySal");
		q.setParameter("min", 1000.0f);
		q.setParameter("max", 3000.0f);
		
		List<Object[]> emps = q.getResultList();
		
		for(Object[] emp : emps)
			System.out.println(emp[0]+" : "+emp[1]);
		
		
		
		
	}

}
