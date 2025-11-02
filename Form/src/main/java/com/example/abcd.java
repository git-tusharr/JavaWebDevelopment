package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Authenticator.RequestorType;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/wel")
public class abcd extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		PrintWriter out=res.getWriter();	
		out.print("hello world");
		
		HttpSession session=req.getSession();
		session.setAttribute(name, "name");
	}
	

}
