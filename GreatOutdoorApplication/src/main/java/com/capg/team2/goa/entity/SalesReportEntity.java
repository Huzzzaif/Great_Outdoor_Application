package com.capg.team2.goa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class SalesReportEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long salesReportid;
	private String productId;
	@Column
	private String productName;
	@Column
	private int quantitySold;
	@Column
	private double totalSale;
	public long getSalesReportid() {
		return salesReportid;
	}
	public void setSalesReportid(long salesReportid) {
		this.salesReportid = salesReportid;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantitySold() {
		return quantitySold;
	}
	public void setQuantitySold(int quantitySold) {
		this.quantitySold = quantitySold;
	}
	public double getTotalSale() {
		return totalSale;
	}
	public void setTotalSale(double totalSale) {
		this.totalSale = totalSale;
	}
	
}