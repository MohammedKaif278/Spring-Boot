package com.employee.model;


public class Employee {
		private int id;
		private String name;
		private String designation;
		private double salary;
		private boolean active;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public boolean isActive() {
			return active;
		}
		public void setActive(boolean active) {
			this.active = active;
		}
		public Employee(int id, String name, String designation, double salary, boolean active) {
			super();
			this.id = id;
			this.name = name;
			this.designation = designation;
			this.salary = salary;
			this.active = active;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
					+ ", active=" + active + "]";
		}
		
		
	
}
