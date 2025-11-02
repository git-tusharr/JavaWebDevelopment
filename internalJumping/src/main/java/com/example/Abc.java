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
public class Abc extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("email");
		String pass=req.getParameter("pass");
		
		PrintWriter out=res.getWriter();
		if (name.equals("tushar")&& pass.equals("1234")) {
			req.setAttribute("name", name);
			 
			RequestDispatcher rd=req.getRequestDispatcher("profile.jsp");
			rd.forward(req,res);
		}else {
			res.setContentType("text/html");
			out.print("Did not match credentials");
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.include(req, res);
			
		}
		
	}

}
