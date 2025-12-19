package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(AppConfig.class);
		AccountViewer accountViewer = con.getBean(AccountViewer.class);
		accountViewer.view();
	}
}
