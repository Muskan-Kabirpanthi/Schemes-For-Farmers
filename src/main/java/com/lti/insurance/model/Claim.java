package com.lti.insurance.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="claim")
public class Claim {

	@Id
	@Column(name="claim_id")
	private int claimId;
	@Column(name="email_id")
	private String emailId;
	@Column(name="policy_no")
	private int policyId;
	@Column(name="cause_of_loss")
	private String cause;
	@Column(name="date_of_loss")
	private LocalDate date;
	@Column(name="status")
	private String status;
		
	public Claim() {
		super();
	}

	public Claim(int claimId, String emailId, int policyId, String cause, LocalDate date, String status) {
		super();
		this.claimId = claimId;
		this.emailId = emailId;
		this.policyId = policyId;
		this.cause = cause;
		this.date = date;
		this.status = status;
	}

	public int getClaimId() {
		return claimId;
	}

	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

	@Override
	public String toString() {
		return "Claim [claimId=" + claimId + ", emailId=" + emailId + ", policyId=" + policyId + ", cause=" + cause
				+ ", date=" + date + ", status=" + status + "]";
	}
			
}
