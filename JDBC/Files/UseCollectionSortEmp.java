package apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Set;
import java.util.TreeSet;

import entities.Emp;

public class UseCollectionSortEmp {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbcurl="jdbc:mysql://localhost:3306/mydac";
		Connection con = DriverManager.getConnection(jdbcurl,"root","mkmeena97");
		
		System.out.println("Connection Established.......");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select d.DNAME , avg(SAL) from emp e , dept d where e.DEPTNO=d.DEPTNO group by d.DNAME order by avg(SAL) desc");
		
		while(rs.next())
		{
			System.out.print(rs.getString(1)+" : ");
			System.out.println(rs.getFloat(2));
		}
		
		
		
	}

}
