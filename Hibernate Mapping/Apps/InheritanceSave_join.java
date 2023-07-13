package apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Emp;
import entities.PermanentEmp;
import entities.TemporaryEmp;

public class InheritanceSave_join {

	public static void main(String[] args) {

		//create the service
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
				
		//read the info from hibernate.cfg.xml file
		Metadata metadata= new MetadataSources(registry).getMetadataBuilder().build();
				
		//Connect to database
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
				
		Session session = sf.openSession();
		
		Emp e1=new PermanentEmp(1,"Tez","tsk@gmail.com","7665770360",40000.50f,5700.00f,9860.98f,3859.95f);
		Emp e2=new TemporaryEmp(2,"Mahendra","meena.mk@gmail.com","9095846231",26400.00f,5096.67f,579.00f);
		
		Transaction tr = session.beginTransaction();
		session.save(e1);
		session.save(e2);
		
		tr.commit();
		
		System.out.println("Employee Saved");
		
		session.close();
		sf.close();
		
	}

}
