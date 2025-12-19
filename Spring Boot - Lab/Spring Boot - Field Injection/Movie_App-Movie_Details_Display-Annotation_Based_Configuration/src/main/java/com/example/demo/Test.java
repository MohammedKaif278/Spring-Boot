package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo")
public class Test {

    private final MovieViewer movieViewer;

    Test(MovieViewer movieViewer) {
        this.movieViewer = movieViewer;
    }
	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(Test.class);
		MovieViewer movieViewer = con.getBean(MovieViewer.class);
		movieViewer.display();
	}
}
