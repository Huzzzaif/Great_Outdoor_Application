package com.capg.team2.goa.entity;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="cart")
public class CartitemEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	
	
	private String userId;
	
	@ElementCollection
	@Column
	private Map<ProductEntity , Integer> products;
	@Column
	private double cartTotalPrice;
	@Column
	private int totalQuantity;
	
	
	public CartitemEntity() {
		super();
	}
	public CartitemEntity(int cartId, String userId, Map<ProductEntity, Integer> products, double cartTotalPrice,
			int totalQuantity) {
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.products = products;
		this.cartTotalPrice = cartTotalPrice;
		this.totalQuantity = totalQuantity;
	}
	public int getcartId() {
		return cartId;
	}
	public void setcartId(int cartId) {
		this.cartId = cartId;
	}
	public String getuserId() {
		return userId;
	}
	public void setuserId(String userId) {
		this.userId = userId;
	}
	public Map<ProductEntity, Integer> getProducts() {
		return products;
	}
	public void setProducts(Map<ProductEntity, Integer> products) {
		this.products = products;
	}
	public double getCartTotalPrice() {
		return cartTotalPrice;
	}
	public void setCartTotalPrice(double cartTotalPrice) {
		this.cartTotalPrice = cartTotalPrice;
	}
	public int getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	
	

	

	   

	   

}
