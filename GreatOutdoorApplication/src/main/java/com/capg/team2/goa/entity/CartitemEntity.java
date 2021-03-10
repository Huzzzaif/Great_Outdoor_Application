package com.capg.team2.goa.entity;

import java.util.Map;

public class CartitemEntity {
	
	private int cartid;
	private String userid;
	private Map<ProductEntity, Integer> products;
	private double cartTotalPrice;
	private int totalQuantity;

}
