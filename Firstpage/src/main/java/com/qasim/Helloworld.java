package com.qasim;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Helloworld
 */
@WebServlet("/Helloworld")
public class Helloworld extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Helloworld() {
    	
    	
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("Text/HTML");
		String name =request.getParameter("fname");
		String lname =request.getParameter("lname");
		PrintWriter out = response.getWriter();
		out.println("<h1>first name: " + name +"</h1>" );
		out.println("<h1>Last name: " + lname +"</h1>" );
//		response.getWriter().append("Served at: "+name).append(request.getContextPath());
		
		
		
		
		
		
		
		
				String destination = "index.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(destination);
		
		
		String name1 = "Qasim ";
		request.setAttribute("name", name1);
		 
		Integer Assignmentnumber = 3;
		request.setAttribute("AS", Assignmentnumber);
//		
		
//		MySQLAccess access = new MySQLAccess();
//		try {
//			access.insertIntoDatabase(name, lname, "dummy");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		 

				requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
		
		
		
		
		
	}

}
