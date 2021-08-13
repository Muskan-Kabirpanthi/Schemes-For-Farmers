package com.lti.myPack.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FarmersDatas")
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
	private int landId;
	private int area;
	private String address;
	private String city;
	private String state;
	private String pinCode;

	public Farmer() {
	}

	public Farmer(int farmerId, String farmerName, String email, String mobNumber, String accountNo, String ifscCode,
			String adhaarNo, String panNo, String certificateNo, String password, int landId, int area, String address,
			String city, String state, String pinCode) {
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
		this.landId = landId;
		this.area = area;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;

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

	public int getLandId() {
		return landId;
	}

	public void setLandId(int landId) {
		this.landId = landId;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

}