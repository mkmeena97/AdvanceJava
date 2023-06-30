package apps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStatement {

	public static void main(String[] args) throws Exception  {

		
			Class.forName("com.mysql.cj.jdbc.Driver");
			String jdbcurl="jdbc:mysql://localhost:3306/mydac";
			Connection con = DriverManager.getConnection(jdbcurl,"root","mkmeena97");
			System.out.println("Coneection Established ......");
			
			Statement st = con.createStatement();
			
			//Return type of executeUpdate is INT 
			int n = st.executeUpdate("update emp set SAL = 850 where SAL<=800");
			System.out.println("total number of update occurs in databases : "+n);
			
			//Return type of executeQuery is ResultSet
			ResultSet rs = st.executeQuery("select * from emp where SAL=850 ");
			while(rs.next())
			{
				System.out.println("Salary Updated of "+rs.getString(2));
				System.out.println("Upated salary is : "+rs.getFloat(6));
			}
			
			
		
	}

}
