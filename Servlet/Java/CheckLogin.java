package FirstServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/logincheck")
public class CheckLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
     Connection con ; 
     
     
   
    @Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		//Throws not possible in overridden methods  so try catch block needed
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					String jdbcUrl="jdbc:mysql://localhost:3306/shoppingdb";
					con=DriverManager.getConnection(jdbcUrl,"root","mkmeena97");
					System.out.println("connection done");
					
				} 
				catch (ClassNotFoundException | SQLException e ) 
				{
					e.printStackTrace();
				}
	}


	public CheckLogin() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		PrintWriter out =response.getWriter();
		String uid=request.getParameter("uid");
		String pwd=request.getParameter("pwd");
		
		
		//create and execute query
		PreparedStatement ps=null;
		ResultSet rs=null;
		try 
		{
			ps= con.prepareStatement("select * from users where u_id=? and password=?");
			ps.setString(1, uid);
			ps.setNString(2, pwd);
			
			rs=ps.executeQuery();
			System.out.println(rs);
			
			if(rs.next())
			{
				if(rs.getString(1).equals(uid) && rs.getString(2).equals(pwd))
				{
					out.print("<h3>login Success</h3>");
				}
			}
			else
			{
				out.print("<h3>Login Failed</h3>");
			}
			
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				if(rs!=null)
					rs.close();
				ps.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		}
	}

}
