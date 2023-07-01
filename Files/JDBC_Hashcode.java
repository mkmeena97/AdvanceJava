package apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;
import entities.Emp3;

public class JDBC_Collection {

	public static void main(String[] args) {

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String jdbcUrl="jdbc:mysql://localhost:3306/mydac";
			
			Connection con = DriverManager.getConnection(jdbcUrl,"root","mkmeena97");
			System.out.println("Connection Established");
			
			Statement st = con.createStatement();
			
			
			//Make Searching easy on the basis of dept
			System.out.println();
			System.out.println("--------------HashSet-------------------------------");
			System.out.println();
			ResultSet rs1 = st.executeQuery("select * from emp ");
			Set<Emp3> emps3 = new HashSet<>();
			
			while(rs1.next())
			{
				System.out.println(rs1.getInt(1));
				Emp3 e3 = new Emp3(rs1.getInt(1),rs1.getString(2),rs1.getNString(3),rs1.getInt(4),rs1.getDate(5),rs1.getFloat(6),rs1.getFloat(7),rs1.getInt(8));
				emps3.add(e3);
			}
			for(Emp3 e3:emps3)
			{
				System.out.println(e3);
			}
			
			
			
			
			con.close();
			System.out.println();
			System.out.println("-----------------------------------------------------------");
			System.out.println("Connection Closed Sucessfully.........");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Driver class not found !!!!");
		}
		catch(SQLException e)
		{
			System.out.println("Connection rejected");
		}
		
	}

}
