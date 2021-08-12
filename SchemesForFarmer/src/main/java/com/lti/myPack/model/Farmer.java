package com.lti.myPack.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="FarmersDatas")
public class Farmer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int farmerId;
	private String farmerName;
	private String email;
	private String mobNumber;
	private String accountNo;
	private String ifscCode;
	private String adhaarNo;
	private String panNo;
	private String certificateNo;
	private String password;
	
//	@Column(name="landId",insertable = false,updatable = false)
//	private int landId;
	
	private int locationId;
	
	@OneToOne(cascade=CascadeType.ALL)  //fetch=FetchType.LAZY it was beside cascade
	@JoinColumn(name="landId")
	private Land land;
	
	
	public Land getLand() {
		return land;
	}


	public void setLand(Land land) {
		this.land = land;
	}


	public int getFarmerId() {
		return farmerId;
	}


	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}


	public String getFarmerName() {
		return farmerName;
	}


	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}




	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobNumber() {
		return mobNumber;
	}


	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}


	public String getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


	public String getIfscCode() {
		return ifscCode;
	}


	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}


	public String getAdhaarNo() {
		return adhaarNo;
	}


	public void setAdhaarNo(String adhaarNo) {
		this.adhaarNo = adhaarNo;
	}


	public String getPanNo() {
		return panNo;
	}


	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}


	public String getCertificateNo() {
		return certificateNo;
	}


	public void setCertificateNo(String certificateNo) {
		this.certificateNo = certificateNo;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


//	public int getLandId() {
//		return landId;
//	}
//
//
//	public void setLandId(int landId) {
//		this.landId = landId;
//	}


	public int getLocationId() {
		return locationId;
	}


	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}


	public Farmer() {}


	public Farmer(int farmerId, String farmerName, String email, String mobNumber, String accountNo, String ifscCode,
			String adhaarNo, String panNo, String certificateNo, String password,  int locationId,
			Land land) {
		super();
		this.farmerId = farmerId;
		this.farmerName = farmerName;
		this.email = email;
		this.mobNumber = mobNumber;
		this.accountNo = accountNo;
		this.ifscCode = ifscCode;
		this.adhaarNo = adhaarNo;
		this.panNo = panNo;
		this.certificateNo = certificateNo;
		this.password = password;
//		this.landId = landId;
		this.locationId = locationId;
		this.land = land;
	}


	
	
	
	
	
	
	

}
