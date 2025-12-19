package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieViewer {
	
	@Autowired
	Movie movie;
	
	public void display()
	{
		movie.showMovie();
	}
}
