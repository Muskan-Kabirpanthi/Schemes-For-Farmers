package com.lti.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Bidder")
public class Bidder {
	@Id	
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
	private int bidder_id;
	private String bidder_name;
	private String email_id;
	private String mobile_no;
	private String account_no;
	private String ifsc_code;
	private String aadhar_no;
	private String pan_no;
	private String license_no;
	private String password;
	public Bidder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bidder(int bidder_id, String bidder_name, String email_id, String mobile_no, String account_no,
			String ifsc_code, String aadhar_no, String pan_no, String license_no, String password) {
		super();
		this.bidder_id = bidder_id;
		this.bidder_name = bidder_name;
		this.email_id = email_id;
		this.mobile_no = mobile_no;
		this.account_no = account_no;
		this.ifsc_code = ifsc_code;
		this.aadhar_no = aadhar_no;
		this.pan_no = pan_no;
		this.license_no = license_no;
		this.password = password;
	}

	public int getBidder_id() {
		return bidder_id;
	}
	public void setBidder_id(int bidder_id) {
		this.bidder_id = bidder_id;
	}
	public String getBidder_name() {
		return bidder_name;
	}
	public void setBidder_name(String bidder_name) {
		this.bidder_name = bidder_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public String getAadhar_no() {
		return aadhar_no;
	}
	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}
	public String getPan_no() {
		return pan_no;
	}
	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}
	public String getLicense_no() {
		return license_no;
	}
	public void setLicense_no(String license_no) {
		this.license_no = license_no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
		
}
