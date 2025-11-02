package com.example;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class One {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1", "root", "Tushar@2006");
		
	
		PreparedStatement ps=con.prepareStatement("select * from form where name='Rohan' and password='r123' ");
		
		
		ResultSet i = ps.executeQuery();
		
		
//		while(i.next()) {
			
//			String name=i.getString("name");
//			String pass=i.getString("pass");
			System.out.println(name+" "+pass);
//		}
		
	}
}
