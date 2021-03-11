package com.capg.team2.goa.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class GrowthReportEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long growthReportid;
	
	@Column
	private LocalDate currentdate;
	@Column
	private double revenue;
	@Column
	private double amountChange;
	@Column
	private double percentageGrowth;
	@Column
	private String colorCode;
	public long getGrowthReportid() {
		return growthReportid;
	}
	public void setGrowthReportid(long growthReportid) {
		this.growthReportid = growthReportid;
	}
	public LocalDate getCurrentdate() {
		return currentdate;
	}
	public void setCurrentdate(LocalDate currentdate) {
		this.currentdate = currentdate;
	}
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	public double getAmountChange() {
		return amountChange;
	}
	public void setAmountChange(double amountChange) {
		this.amountChange = amountChange;
	}
	public double getPercentageGrowth() {
		return percentageGrowth;
	}
	public void setPercentageGrowth(double percentageGrowth) {
		this.percentageGrowth = percentageGrowth;
	}
	public String getColorCode() {
		return colorCode;
	}
	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}
		
}