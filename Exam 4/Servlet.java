package logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentHome
 */
@WebServlet("/studenthome")
public class StudentHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	
	public void init(ServletConfig config) throws ServletException {
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String jdbcUrl="jdbc:mysql://localhost:3306/studentsdb";
			
			con = DriverManager.getConnection(jdbcUrl,"root","mkmeena97");
			System.out.println("Connection Established................");
	
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			
			e.printStackTrace();
		}
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.print("<table border=1>");
		
		 
		try {
			Statement st = con.createStatement();
		
			ResultSet rs = null;
		
			rs = st.executeQuery("select * from students ");

				if(rs.next())
				{
					out.print("<tr>");
					out.print("<td>sid</td>");
					out.print("<td>sname</td>");
					out.print("<td>Email</td>");
					out.print("<td>Contact</td>");
					out.print("<td>Average</td>");
					out.print("<td>Grade</td>");
					out.print("</tr>");
					while(rs.next())
					{
						out.println("<tr>");
						out.print("<td>"+rs.getInt(1)+"</td>");
						out.print("<td>"+rs.getString(2)+"</td>");
						out.print("<td>"+rs.getString(3)+"</td>");
						out.print("<td>"+rs.getString(4)+"</td>");
						out.print("<td>"+rs.getFloat(5)+"</td>");
						out.print("<td>"+rs.getString(6)+"</td>");
						out.println("</tr>");
					}
				
					
				}
			
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
