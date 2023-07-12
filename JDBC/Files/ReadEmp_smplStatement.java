package apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadEmp_smplStatement {

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String jdbcurl="jdbc:mysql://localhost:3306/mydac";
			Connection con =DriverManager.getConnection(jdbcurl,"root","mkmeena97");
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select * from emp ");
			
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+" : ");
				System.out.print(rs.getString(2)+" : ");
				System.out.print(rs.getString(3)+" : ");
				System.out.print(rs.getInt(4)+" : ");
				System.out.print(rs.getDate(5)+" : ");
				System.out.print(rs.getFloat(6)+" : ");
				System.out.print(rs.getFloat(7)+" : ");
				System.out.print(rs.getInt(8)+" : ");
				System.out.println();
			}
			st.close();
			rs.close();
			con.close();
			
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Driver Class Not Found!!!!");
		}
		catch(SQLException e)
		{
			System.out.println("SQL Exception!!!!");
		}
			

				
		
	}

}
