package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/logo")
public class login extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		
		String email=req.getParameter("email");
		String pass=req.getParameter("pass"); 
		
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/register", "root", "Tushar@2006");

            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM users WHERE email=? AND pass=?");

            ps.setString(1, email);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                HttpSession session = req.getSession();
                session.setAttribute("email", email);
                session.setAttribute("pass", pass);

                RequestDispatcher rd = req.getRequestDispatcher("/Home.jsp");
                rd.forward(req, resp);
            } else {
                resp.setContentType("text/html");
                
                out.print("Credentials not matched");
                RequestDispatcher rd = req.getRequestDispatcher("/Login.html");
                rd.include(req, resp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
