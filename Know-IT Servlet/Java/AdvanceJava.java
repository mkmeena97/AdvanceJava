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


@WebServlet("/advancejava")
public class AdvanceJava extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		RequestDispatcher rd =request.getRequestDispatcher("/header");
		rd.include(request, response);
		out.print("<h3>Advance Java</h3>");
		out.print("<p>Advance Java is nothing but a class. Which is use for creating dynamic web page</p>");
		out.print("<p>Advanced Java refers to a set of advanced features and technologies that extend the capabilities of the Java programming language. It builds upon the core concepts of Java and provides additional tools, libraries, and frameworks for developing more sophisticated and complex applications. Advanced Java is typically used for enterprise-level development, web applications, and server-side programming.</p>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
