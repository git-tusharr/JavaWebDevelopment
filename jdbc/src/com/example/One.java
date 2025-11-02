package com.example;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

class One {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1", "root", "Tushar@2006");
	}
}
