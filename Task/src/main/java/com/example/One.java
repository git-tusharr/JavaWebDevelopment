package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/reqst") 
public class One extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException { 
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		String email=req.getParameter("email");
		
		PrintWriter out=res.getWriter();
		if (email.equals("tushar")&& pass.equals("1234")) {
			
			req.getSession().setAttribute("name", name);
			 
			RequestDispatcher rd=req.getRequestDispatcher("profile.jsp");
			rd.forward(req,res);
		}else {
			res.setContentType("text/html");
			out.print("<p style='color:pink'>Did not matched credentials</p>");
			RequestDispatcher rd =req.getRequestDispatcher("One.jsp");
			rd.include(req, res);
		}
		
	}

}
