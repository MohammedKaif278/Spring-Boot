package com.example.demo;

import java.awt.Menu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
		MenuService menuService = con.getBean(MenuService.class);
		System.out.println(menuService);
	}
}
