package com.example.demo;

public class Customer {
	private int cid;
	private String cname;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	
	public void demo()
	{
		System.out.println(cid+"=========="+cname);
	}
	
	public Customer() {
		System.out.println("Create IOC_COntainer Through XML-Configuration");
	}
}
