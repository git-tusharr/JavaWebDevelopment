package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class One {

    public static void main(String args[]) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "Tushar@2006");
         
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "Tushar@2006");

            String name = "Rohan";
            String pass = "r123";

            PreparedStatement ps = con.prepareStatement("INSERT INTO form VALUES (?, ?)");

            ps.setString(1, name);
            ps.setString(2, pass);

            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("Success");
            } else {
                System.out.println("Failed");
            }

            // Close resources
            ps.close();
            con.close();

        } 
    }