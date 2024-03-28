package org.java;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Clogin
 */
@WebServlet("/Clogin")
public class Clogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Clogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Email = request.getParameter("Email");
		String password = request.getParameter("Password");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "admin");
			String sql="select*from Coffee_reg1 where Email='"+Email+"' and password='"+password+"'";
		    PreparedStatement ps=con.prepareStatement(sql);
		    ResultSet rs=ps.executeQuery();
		    while(rs.next()) {
		    	String email=rs.getString("Email");
		    	String Password=rs.getString("Password");
		    }
	if(Email.equals(Email) && password.equals(password)) {
		request.setAttribute("Email", Email);
		request.getRequestDispatcher("LoginSuccess.jsp").forward(request, response);
	}
	else { 
		System.out.println("invalid");
	}
		}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	}

		
	}

