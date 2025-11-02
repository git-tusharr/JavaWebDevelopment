package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/req")
public class One extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		PrintWriter out=res.getWriter();
		
		if (email.equals("tushar") && pass.equals("1234")) {
			RequestDispatcher rd=req.getRequestDispatcher("Profile.jsp");
			rd.forward(req, res);
		}
		else {
			res.setContentType("text/html");
			out.print("Did not matched");
			RequestDispatcher rd=req.getRequestDispatcher("One.jsp");
			rd.include(req, res);
			
		}
	}

}
