package apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

	public static void main(String[] args) {

		//step-1 : loading driver class in memory
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String jdbcUrl="jdbc:mysql://localhost:3306/mydac";
			
			Connection con = DriverManager.getConnection(jdbcUrl,"root","mkmeena97");
			System.out.println("Connection Established");
			
			con.close();
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
