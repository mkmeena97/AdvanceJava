package apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Set;
import java.util.TreeSet;

import entities.Emp;

public class GetEmpShorted {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String jdbcurl="jdbc:mysql://localhost:3306/mydac";
		Connection con = DriverManager.getConnection(jdbcurl,"root","mkmeena97");
		
		System.out.println("connection Established.............");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from emp ");
		
		//Sorted on salary
		Set<Emp> emps=new TreeSet<>();
		
		while(rs.next())
		{
			Emp e=new Emp(rs.getInt(1),rs.getString(2),rs.getNString(3),rs.getInt(4),rs.getDate(5),rs.getFloat(6),rs.getFloat(7),rs.getInt(8));
			emps.add(e);
		}
		rs.close();
		st.close();
		con.close();
		
		for(Emp e:emps)
			System.out.println(e);
		
	}

}
