package com.example.springJDBC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class springConfigFile {
	
	@Bean
	public DriverManagerDataSource ds() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("Tushar@2006");
		
		return dataSource;
	}
	
	
	@Bean
	public JdbcTemplate j() {
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(ds());
		
		return template;
		
	}
	

	
	

}
