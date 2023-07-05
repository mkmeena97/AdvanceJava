package DAC_Modules;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/java")
public class CoreJava extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		RequestDispatcher rd =request.getRequestDispatcher("/header");
		rd.include(request, response);
		out.print("<h3>Core Java</h3>");
		out.print("<p>Core Java refers to the fundamental and foundational components of the Java programming language. It encompasses the basic concepts, libraries, and features that are essential for Java application development. Core Java serves as the building blocks for developing various types of software, including desktop applications, web applications, mobile apps, and more.</p>");
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
