package com.lti.myPack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "insurance_policy")
public class Policy {
	@Id
	@Column(name = "policy_no")
	private int policyId;
	@Column(name = "insurance_id")
	private int insuranceId;
	@Column(name = "farmer_name")
	private String farmerName;
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "crop_type")
	private String cropType;
	@Column(name = "crop_name")
	private String cropName;
	@Column(name = "perimum_amount")
	private double perimumAmount;
	@Column(name = "sum_insured")
	private double sumInsured;

	public Policy() {
		super();
	}

	public Policy(int policyId, int insuranceId, String farmerName, String emailId, String cropType, String cropName,
			double perimumAmount, double sumInsured) {
		super();
		this.policyId = policyId;
		this.insuranceId = insuranceId;
		this.farmerName = farmerName;
		this.emailId = emailId;
		this.cropType = cropType;
		this.cropName = cropName;
		this.perimumAmount = perimumAmount;
		this.sumInsured = sumInsured;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getFarmerName() {
		return farmerName;
	}

	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public double getPerimumAmount() {
		return perimumAmount;
	}

	public void setPerimumAmount(double perimumAmount) {
		this.perimumAmount = perimumAmount;
	}

	public double getSumInsured() {
		return sumInsured;
	}

	public void setSumInsured(double sumInsured) {
		this.sumInsured = sumInsured;
	}

	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", insuranceId=" + insuranceId + ", farmerName=" + farmerName
				+ ", emailId=" + emailId + ", cropType=" + cropType + ", cropName=" + cropName + ", perimumAmount="
				+ perimumAmount + ", sumInsured=" + sumInsured + "]";
	}

}