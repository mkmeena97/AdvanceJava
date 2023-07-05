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


@WebServlet("/ds")
public class DataStructure extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		RequestDispatcher rd =request.getRequestDispatcher("/header");
		rd.include(request, response);
		out.print("<h3>Core Java</h3>");
		out.print("<p>Data structure is a way of organizing and storing data in a computer's memory or in external storage, such as databases or files. It provides a means to efficiently access, manipulate, and perform operations on the data.</p>");
		out.print("<p>Data structures define the organization and layout of data elements, as well as the relationships between them. They determine how data is stored and retrieved, and they impact the efficiency and effectiveness of algorithms and operations performed on the data.</p>");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
