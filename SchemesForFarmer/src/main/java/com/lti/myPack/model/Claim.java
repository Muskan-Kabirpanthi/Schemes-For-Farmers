package com.lti.myPack.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="claim")
public class Claim {

	@Id
	@Column(name="claim_id")
	private int claimId;
	@Column(name="policy_no")
	private int policyId;
	@Column(name="cause_of_loss")
	private String cause;
	@Column(name="date_of_loss")
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate date;
	@Column(name="status")
	private String status;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Farmer farmer_id;
			
	public Claim() {
	}

	public Claim(Farmer farmer_id,int claimId, int policyId, String cause, LocalDate date, String status) {
		this.farmer_id=farmer_id;
		this.claimId = claimId;
		this.policyId = policyId;
		this.cause = cause;
		this.date = date;
		this.status = status;
	}
	
	

	public Farmer getFarmerId() {
		return farmer_id;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer_id = farmer;
	}

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
		
}