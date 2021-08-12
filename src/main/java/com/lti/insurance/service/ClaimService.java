package com.lti.insurance.service;

import java.util.List;

import com.lti.insurance.model.Claim;

public interface ClaimService {
	public List<Claim> getClaims();
	public boolean addClaim(Claim claim);
	public boolean updateClaim(Claim claim);
	public boolean deleteClaim(Claim claim);
	public int generateClaimId();
	public boolean addClaimByWeb(Claim claim);
	public List<Claim> findClaimByEmail(String email);
	public List<Claim> findClaimByStatus();
	
}
