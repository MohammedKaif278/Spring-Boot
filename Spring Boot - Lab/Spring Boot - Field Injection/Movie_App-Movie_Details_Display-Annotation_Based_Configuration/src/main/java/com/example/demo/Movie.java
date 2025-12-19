package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Movie {
	private int movieId=101;
	private String title="abc",genre="comedy";
	
	public void showMovie()
	{
		System.out.println("movieId : "+movieId);
		System.out.println("title : "+title);
		System.out.println("genre : "+genre);
	}
}
