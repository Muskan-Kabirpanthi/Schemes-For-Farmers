package com.lti.myPackage.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="Sales")
public class Sales {
	
	@Id
	private int salesId;
	private int prodId;
	private String cropName;
	private String cropType;
	
	@JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate sales_Date;
	private int quantity;
	private int msp;
	private int soldPrice;
	private int Farmer_ID;
	private int Bidder_ID;
	public Sales() {
		super();
	}
	
	
	public Sales(int salesId, int prodId, String cropName, String cropType, LocalDate sales_Date, int quantity, int msp,
			int soldPrice, int farmer_ID, int bidder_ID) {
		super();
		this.salesId = salesId;
		this.prodId = prodId;
		this.cropName = cropName;
		this.cropType = cropType;
		this.sales_Date =sales_Date;
		this.quantity = quantity;
		this.msp = msp;
		this.soldPrice = soldPrice;
		Farmer_ID = farmer_ID;
		Bidder_ID = bidder_ID;
	}


	public int getSalesId() {
		return salesId;
	}

	public void setSalesId(int salesId) {
		this.salesId = salesId;
	}

	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public String getCropType() {
		return cropType;
	}
	public void setCropType(String cropType) {
		this.cropType = cropType;
	}
	
	public LocalDate getSales_Date() {
		return sales_Date;
	}


	public void setSales_Date(LocalDate sales_Date) {
		this.sales_Date = sales_Date;
	}


	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getMsp() {
		return msp;
	}
	public void setMsp(int msp) {
		this.msp = msp;
	}
	public int getSoldPrice() {
		return soldPrice;
	}
	public void setSoldPrice(int soldPrice) {
		this.soldPrice = soldPrice;
	}
	public int getFarmer_ID() {
		return Farmer_ID;
	}
	public void setFarmer_ID(int farmer_ID) {
		Farmer_ID = farmer_ID;
	}
	public int getBidder_ID() {
		return Bidder_ID;
	}
	public void setBidder_ID(int bidder_ID) {
		Bidder_ID = bidder_ID;
	}
	
	
	

	

}
