package apps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Accept_Sal_range {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String jdbcUrl="jdbc:mysql://localhost:3306/mydac";
			
			Connection con = DriverManager.getConnection(jdbcUrl,"root","mkmeena97");
			System.out.println("Connection Established................");
			
			
			PreparedStatement ps = con.prepareStatement("select * from emp where SAL between ? and ?");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter Minimun Salary : ");
			float minSal=Float.parseFloat(br.readLine());
			System.out.println("Enter Maximun Salary : ");
			float maxSal=Float.parseFloat(br.readLine());
			
			ps.setFloat(1, minSal);
			ps.setFloat(2, maxSal);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
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
			}
			else
			{
				System.out.println("No Employee found in given range ..");
			}
			
			
			
			ps.close();
			rs.close();
			con.close();
			System.out.println();
			System.out.println("-----------------------------------------------------------");
			System.out.println("Connection Closed Sucessfully.........");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Driver class not found !!!!!!!!!");
		}
		catch(SQLException e)
		{
			System.out.println("Connection rejected !!!!!!!!!!!!");
			e.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.println("IO exception throws by br.readLine() !!!!!!!!!!");
		}
		
		
	}

}
