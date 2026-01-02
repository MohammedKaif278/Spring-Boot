package com.zomato.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zomato.model.Customer;

@Repository
public class CustomerDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	//Insert Customer
	public String insertCustomer(Customer c)
	{
		String sql="insert into customer values(?,?,?)";
		int update=jdbcTemplate.update(sql,c.getCid(),c.getCname(),c.getCaddress());
		return update>0?"Insert Successfully":"Insert failed";
	}
	
	//Update
	public String updateCustomer(Customer c)
	{
		String sql="update customer set cname=?,caddress=? where cid=?";
		 int update =jdbcTemplate.update(sql,c.getCname(),c.getCaddress(),c.getCid());
		return update >0 ? "Update Successfully":"Update Failed";
	}
	
	//Delete 
	public String deleteCustomer(int cid)
	{
		String sql="delete from customer where cid=?";
		int update = jdbcTemplate.update(sql,cid);
		return update>0  ? "Delete Successfully":"Delete Failed";
	}
	
	//Fetch
	public Customer getCustomer(int cid)
	{
		String sql="select * from customer where cid=?";
		Customer customer = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Customer.class),cid);
		return customer;
	}
	
	//Fetch All
	public List<Customer> getAllCustomer()
	{
		String sql="select * from customer";
		List<Customer> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Customer.class));
		return list;
	}
	
}
