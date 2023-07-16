package apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Emp;

public class DI_App {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("AutoWireContext.xml");
		Emp e =(Emp) ctx.getBean("emp");
		System.out.println(e.toString());
		
	}

}
