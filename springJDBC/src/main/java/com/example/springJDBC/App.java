package com.example.springJDBC;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.ValueLayout.OfBoolean;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(springConfigFile.class);

        JdbcTemplate template = (JdbcTemplate) context.getBean("j");

        String name = "nikita";
        String email = "Tushar";

        String querry = "INSERT INTO users(name, email) VALUES (?, ?)";
        int i = template.update(querry, name, email);                                
        																			  
        if (i > 0) System.out.println("Data inserted");

        
        List<One> list = template.query("SELECT * FROM users", new rmp());

        for (One obj : list) {
            System.out.println("Name: " + obj.getName());
            System.out.println("Email: " + obj.getEmail());
        }
    }
}
