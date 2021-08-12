package com.lti.insurance.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurance")
public class Insurance {
	@Id
	@Column(name="insurance_id")
	private int insuranceId ;
	@Column(name="insurance_name")
	private String insuranceName;
	@Column(name="company_name")
	private String companyName;
	@Column(name="crop_type")
	private String cropType;
	@Column(name="sum_insured")
	private double sumInsured;
	@Column(name="year")
	private int year;
	@Column(name="perimum_percentage")
	private double perimumPercentage;
	
	public Insurance() {
	}

	public Insurance(int insuranceId, String insuranceName, String companyName, String cropType, double sumInsured,
			int year, double perimumPercentage) {
		this.insuranceId = insuranceId;
		this.insuranceName = insuranceName;
		this.companyName = companyName;
		this.cropType = cropType;
		this.sumInsured = sumInsured;
		this.year = year;
		this.perimumPercentage = perimumPercentage;
	}

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCropType() {
		return cropType;
	}

	public void setCropType(String cropType) {
		this.cropType = cropType;
	}

	public double getSumInsured() {
		return sumInsured;
	}

	public void setSumInsured(double sumInsured) {
		this.sumInsured = sumInsured;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPerimumPercentage() {
		return perimumPercentage;
	}

	public void setPerimumPercentage(double perimumPercentage) {
		this.perimumPercentage = perimumPercentage;
	}
	
	    
}
