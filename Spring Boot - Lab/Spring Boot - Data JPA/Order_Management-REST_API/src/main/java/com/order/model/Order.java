package com.order.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="order_info")
public class Order {

	@Id
	private Integer orderId;
	
	private String customerName;
	private String productName;
	private Integer quantity;
	private String status;
	
	
}
