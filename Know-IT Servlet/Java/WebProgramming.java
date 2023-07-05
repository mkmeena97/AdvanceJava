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


@WebServlet("/wp")
public class WebProgramming extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		RequestDispatcher rd =request.getRequestDispatcher("/header");
		rd.include(request, response);
		out.print("<h3>Web Programming</h3>");
		out.print("<p>Web programming refers to the development and implementation of applications, websites, and other web-based solutions using programming languages and technologies specifically designed for the web. It involves writing code and creating functionality that enables the interaction between users and web-based systems.</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
