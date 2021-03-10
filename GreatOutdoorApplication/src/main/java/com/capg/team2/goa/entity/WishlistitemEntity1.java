package com.capg.team2.goa.entity;

import java.util.List;

public class WishlistitemEntity1 
{
	private long wishlistId;
	private String userId;
	private List<String> productId;
	
	
	public long getWishlistId() {
		return wishlistId;
	}
	public void setWishlistId(long wishlistId) {
		this.wishlistId = wishlistId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<String> getProductId() {
		return productId;
	}
	public void setProductId(List<String> productId) {
		this.productId = productId;
	}
	
	
	
}
