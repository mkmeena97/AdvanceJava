package apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Address;
import entities.Student;



public class CompositionSave {

	public static void main(String[] args) {
		//create the service
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		//read the info from hibernate.cfg.xml file
		Metadata metadata= new MetadataSources(registry).getMetadataBuilder().build();
		
		//Connect to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		Session session = sf.openSession();
		
		Address add= new Address("Kothrud","pune","411038");
		Student st = new Student("Tez",add);
		
		Transaction tr = session.beginTransaction();
		session.save(st);
		tr.commit();
		
		System.out.println("Student data saved");
		
		session.close();
		sf.close();
		
	}

}
