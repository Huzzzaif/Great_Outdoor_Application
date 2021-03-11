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

public class CartitemEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartid;
	private String userid;
	@ElementCollection
	@MapKeyColumn(name = "item_name")
    @Column(name = "price")
	private Map<ProductEntity, Integer> products;
	@Column
	private double cartTotalPrice;
	@Column
	private int totalQuantity;
	
	
	
	
	public CartitemEntity() {
		super();
	}
	public CartitemEntity(int cartid, String userid, Map<ProductEntity, Integer> products, double cartTotalPrice,
			int totalQuantity) {
		super();
		this.cartid = cartid;
		this.userid = userid;
		this.products = products;
		this.cartTotalPrice = cartTotalPrice;
		this.totalQuantity = totalQuantity;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
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
