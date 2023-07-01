package apps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prepared_ST_Empid {

	public static void main(String[] args)  {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String jdbcUrl ="jdbc:mysql://localhost:3306/mydac";
			Connection con;

				con = DriverManager.getConnection(jdbcUrl,"root", "mkmeena97");
			
			System.out.println("Connection Established");
			
			PreparedStatement ps = con.prepareStatement("select * from emp where EMPNO=?");
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Empid : ");
			int empno = Integer.parseInt(br.readLine());
			
			
			ps.setInt(1, empno);
			ResultSet rs =ps.executeQuery();
			if(rs.next())
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
			else {
				System.out.println("Enter valid Empid !!!!");
			}
		
		
		} catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			System.out.println("Enter valid Empid !!!!");
	
		}catch (NumberFormatException e) 
		{
		
			e.printStackTrace();
		} catch (IOException e) 
		{
		
			e.printStackTrace();
		}
		
	}

}
