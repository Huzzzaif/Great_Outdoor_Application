package com.capg.team2.goa.entity;

import java.time.LocalDate;
import java.util.Map;

public class OrderEntity {
	
	private String orderid;
	private String userid;
	private Map<ProductEntity, Integer> products;
	private double totalPrice;
	private long totalQuantity;
	private LocalDate dispatchData;
	private LocalDate deliveryData;

}
