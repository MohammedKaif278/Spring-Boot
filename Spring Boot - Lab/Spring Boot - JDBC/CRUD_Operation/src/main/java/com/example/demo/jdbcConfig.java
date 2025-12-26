package com.example.demo;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.example.demo")
public class jdbcConfig {
	
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		ds.setUsername("mk");
		ds.setPassword("mkaif");
		
		return ds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate()
	{
		return new JdbcTemplate(getDataSource());
	}
}
