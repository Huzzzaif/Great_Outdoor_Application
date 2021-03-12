package com.capg.team2.goa.entity;

import java.time.LocalDate;
import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

@Entity
public class OrderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String orderid;
	private String userid;
	@ElementCollection
	private Map<ProductEntity, Integer> products;
	private double totalPrice;
	private long totalQuantity;
	private LocalDate dispatchData;
	private LocalDate deliveryData;
	
	
	public OrderEntity() {
		super();
	}
	public OrderEntity(String orderid, String userid, Map<ProductEntity, Integer> products, double totalPrice,
			long totalQuantity, LocalDate dispatchData, LocalDate deliveryData) {
		super();
		this.orderid = orderid;
		this.userid = userid;
		this.products = products;
		this.totalPrice = totalPrice;
		this.totalQuantity = totalQuantity;
		this.dispatchData = dispatchData;
		this.deliveryData = deliveryData;
	}
	@Override
	public String toString() {
		return "OrderEntity [orderid=" + orderid + ", userid=" + userid + ", products=" + products + ", totalPrice="
				+ totalPrice + ", totalQuantity=" + totalQuantity + ", dispatchData=" + dispatchData + ", deliveryData="
				+ deliveryData + "]";
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
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
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public long getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public LocalDate getDispatchData() {
		return dispatchData;
	}
	public void setDispatchData(LocalDate dispatchData) {
		this.dispatchData = dispatchData;
	}
	public LocalDate getDeliveryData() {
		return deliveryData;
	}
	public void setDeliveryData(LocalDate deliveryData) {
		this.deliveryData = deliveryData;
	}

}
