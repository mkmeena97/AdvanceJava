package Apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Emp;

public class DeleteDemo {

	public static void main(String[] args) {
		//create the service
				StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
						
				//read the info hibernate.cfg.xml file
				Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
						
				//actually conn to database
				SessionFactory sf = metadata.getSessionFactoryBuilder().build();
				
				//open the session
				Session session = sf.openSession();
				
				Emp e = session.get(Emp.class, 1000);
				
				if(e!=null)
				{
					Transaction tr = session.beginTransaction();
					session.delete(e);
					tr.commit();
					System.out.println("deleted successfully");
				}
				session.close();
				sf.close();
	}

}
