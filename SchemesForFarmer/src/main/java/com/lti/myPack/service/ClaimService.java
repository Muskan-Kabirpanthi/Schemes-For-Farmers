package com.lti.myPack.service;

import java.util.List;

import com.lti.myPack.model.Claim;

public interface ClaimService {
	public List<Claim> getClaims();
	public boolean addClaim(Claim claim);
	
	public boolean updateClaim(Claim claim);
	
	public boolean deleteClaim(Claim claim);
	
	public Claim findClaim(int claimId);
	
	//public List<Product> findProductByCategory(String category);
}