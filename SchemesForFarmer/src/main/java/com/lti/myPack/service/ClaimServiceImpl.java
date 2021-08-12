package com.lti.myPack.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.myPack.model.Claim;
import com.lti.myPack.repository.ClaimRepository;

@Service
@Transactional
public class ClaimServiceImpl implements ClaimService{



	@Autowired
	ClaimRepository claimRepo;

	@Override
	public List<Claim> getClaims() {
		return  claimRepo.findAll();
	}

	@Override
	public boolean addClaim(Claim claim) {
		claimRepo.save(claim);
		return true;
	}

	@Override
	public boolean updateClaim(Claim claim) {
		Claim newp = claimRepo.findById(claim.getClaimId()).get();
		newp=claim;
		claimRepo.save(newp);
		return true;
	}

	@Override
	public boolean deleteClaim(Claim claim) {
		claimRepo.delete(claim);
		return true;
	}

	@Override
	public Claim findClaim(int claimId) {
		
		return claimRepo.findById(claimId).get();
	}

}
