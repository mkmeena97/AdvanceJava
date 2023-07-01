package apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;
import java.util.TreeSet;
import entities.Emp1;


public class JDBC_Collection {

	public static void main(String[] args) {

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String jdbcUrl="jdbc:mysql://localhost:3306/mydac";
			
			Connection con = DriverManager.getConnection(jdbcUrl,"root","mkmeena97");
			System.out.println("Connection Established");
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from emp ");
			
			
			//sort based on name
			System.out.println();
			System.out.println("--------------Sorted data based on Name-------------------------------");
			System.out.println();
			
			Set<Emp1> emps1 = new TreeSet<>();
			
			while(rs.next())
			{
				Emp1 e1=new Emp1(rs.getInt(1),rs.getString(2),rs.getNString(3),rs.getInt(4),rs.getDate(5),rs.getFloat(6),rs.getFloat(7),rs.getInt(8));
				emps1.add(e1);
			}
			
			for(Emp1 e1 : emps1)
				System.out.println(e1);
			

			
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
