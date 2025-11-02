package com.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg") 
public class Register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");

        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection(
        	    "jdbc:mysql://localhost:3306/register",
        	    "root",
        	    "Tushar@2006"
        	);


            PreparedStatement ps = con.prepareStatement("INSERT INTO users(name, email, pass) VALUES (?, ?, ?)");

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, pass);

            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("Data inserted successfully!");
               
                RequestDispatcher rd = req.getRequestDispatcher("Login.html");
                rd.forward(req, resp);
            } else {
                System.out.println("Data insertion failed!");
                resp.getWriter().println("Registration failed!");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            resp.getWriter().println("SQL Error: " + e.getMessage());
        }
    }
}
