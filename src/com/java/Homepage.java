package com.java;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Homepage
 */
@WebServlet("/Homepage")
public class Homepage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Homepage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("reg.jsp").forward(request, response);
		
		String name =request.getParameter("name");
		System.out.println(name);
		String Password =request.getParameter("Password");
		System.out.println(Password);
		String FatherName=request.getParameter("FatherName");
		System.out.println(FatherName);
		String DOB=request.getParameter("DOB");
		System.out.println(DOB);
		String PhoneNumber=request.getParameter("PhoneNumber");
		System.out.println(PhoneNumber);
		String Gender=request.getParameter("Gender");
		System.out.println(Gender);
		String[] Courses=request.getParameterValues("Courses");
		for(String x:Courses) {
		System.out.println(x);
		}
		
			
		
	}

}
