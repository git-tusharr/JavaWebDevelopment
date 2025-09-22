package com.example;

import java.awt.image.RescaleOp;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class asd extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out=res.getWriter();
		out.print("name"+req.getp);
		System.out.println("Hello world");
	}
	

}
