package logic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/studentdata")
public class StudentServlet extends HttpServlet {
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
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String contact=request.getParameter("contact");
			int mark1=Integer.parseInt(request.getParameter("sem1"));
			int mark2=Integer.parseInt(request.getParameter("sem1"));
			int mark3=Integer.parseInt(request.getParameter("sem1"));
			int mark4=Integer.parseInt(request.getParameter("sem1"));
			
			float avg = (mark1+mark2+mark3+mark4)/4;
			String grade;
			if(avg>=90)
			{
				grade="Excellent";
			}
			else if(avg>=80 && avg<90)
			{
				grade="Very Good";
			}
			else if(avg>=70 && avg<80)
			{
				grade="Good";
			}
			else if(avg>=60 && avg<70)
			{
				grade="Average";
			}
			else if(avg>=40 && avg<60)
			{
				grade="Pass";
			}
			else
			{
				grade="Fail";
			}
			
			try 
			{
				PreparedStatement ps = con.prepareStatement("insert into students(sname,email,contact,average,grade) values (?,?,?,?,?)");
				ps.setString(1, name);
				ps.setString(2, email);
				ps.setString(3, contact);
				ps.setFloat(4, avg);
				ps.setString(5, grade);

				int n = ps.executeUpdate();
				if(n>0)
				{
					out.println("Student Data Inserted Successfully");
					RequestDispatcher rd = request.getRequestDispatcher("/studenthome");
					rd.forward(request, response);
				}
				else
				{
					out.println("Insertion Failed");
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
