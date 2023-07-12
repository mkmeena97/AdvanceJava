package Apps;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Emp;

public class UpdateDemo {

	public static void main(String[] args) throws ParseException {

		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		//read the info hibernate.cfg.xml file
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
				
		//actually conn to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		//open the session
		Session session = sf.openSession();
		
		Emp e = session.get(Emp.class,1000);
		
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		
		
		if(e!=null)
		{
			//e.setJob("MANAGER");
			//e.setMgr(7839);
			
			 Date hiredate=dateformat.parse("2023-08-12");
			e.setHiredate(hiredate);
			
			Transaction tr = session.beginTransaction();
			session.update(e);
			tr.commit();
			System.out.println("Data Updated");
			
			
		}
		session.close();
		sf.close();
		
	}

}
