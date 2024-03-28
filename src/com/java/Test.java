package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Test{
	public static void main(String[] args) {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "hr","admin");
		String sql="select * from employees";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery ();
		while(rs.next()) {
			String first_name=rs.getString("first_name");
			System.out.println(first_name);
		}
		con.close();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
