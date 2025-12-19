package com.example.demo;

import java.util.Map;

public class MenuService {
	String restaurantName;
	Map<String ,Double> menuItems;
	
	@Override
	public String toString() {
		return "MenuService [restaurantName=" + restaurantName + ", menuItems=" + menuItems + "]";
	}

	public MenuService(String restaurantName, Map<String, Double> menuItems) {
		super();
		this.restaurantName = restaurantName;
		this.menuItems = menuItems;
	}
	
	
}
