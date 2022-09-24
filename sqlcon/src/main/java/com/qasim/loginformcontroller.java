package com.qasim;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.qasim.entity.user_details;
import com.mysql.cj.PreparedQuery;
import com.mysql.cj.protocol.Resultset;

/**
 * Servlet implementation class loginformcontroller
 */
@WebServlet("/loginformcontroller")
public class loginformcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<user_details> list = new ArrayList();
    /**
     * Default constructor. 
     */
    public loginformcontroller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		String username = request.getParameter("Name");
		String emailAddress = request.getParameter("Email");
		String password = request.getParameter("password");
		String action = request.getParameter("action");
		String id =request.getParameter("id");
		String column_name = request.getParameter("column_name");
		String updatedData = request.getParameter("updatedData");
		
		out.print("<h1> name is " + username +" </h1>");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/week3lab", "root", "root");
			
			switch (action) {
			case "get": {
				showDetails(con);
				request.setAttribute("user_details_list", list);
				request.getRequestDispatcher("showdetails.jsp").forward(request, response);
				break;
			}
			case "add": {
				insertData(username, action, password, con);
				out.println("add successfully");
				out.println("");
				out.println("");
				out.println("");
				
				showDetails(con);
				request.setAttribute("user_details_list", list);
				request.getRequestDispatcher("showdetails.jsp").forward(request, response);
				break;
			}
			case "update":{
				updateRecord(Integer.parseInt(id), con, column_name, updatedData);
				out.println("succesfullyUpdated");
				break;
			}
			case "delete":{
				deleteRecord( con,Integer.parseInt(id));
				out.println("succesfullydeleted");
				break;
			}
			
			default:
				out.println("wrong input in action");

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private void insertData(String username, String email_address, String password, Connection con) throws Exception {
		String query = "INSERT INTO user_details ( user_name, email_address, password) VALUES ( ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, username);
		ps.setString(2, email_address);
		ps.setString(3, password);
		ps.executeUpdate();

	}

	private void showDetails(Connection con) throws Exception {

		String query = "select * from user_details";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			list.add(new user_details(Integer.parseInt(rs.getString("user_id")), rs.getString("user_name"),
					rs.getString("email_address"), rs.getString("password")));

		}

	}
	private void updateRecord(int id , Connection con, String column_name, String updatedData) throws Exception {
		String query ="update user_details set "+column_name+" = ? where user_id= ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, updatedData);
        ps.setString(2, id+"");
        ps.executeUpdate();
		
	}
	private void deleteRecord(Connection con,int id) throws SQLException {
	String query ="delete from  user_details " +
	          "where user_id="+id;
	PreparedStatement ps = con.prepareStatement(query);
    ps.executeUpdate();	
	}
}
